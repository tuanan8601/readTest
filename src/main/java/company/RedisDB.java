package company;

import company.entity.Answer;
import company.entity.ObjectiveTest;
import company.entity.Question;
import company.entity.Subject;
import lombok.val;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanResult;

import java.awt.*;
import java.util.*;
import java.util.List;

public class RedisDB {
    public static long getMaxIndex(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        List<Long> index = new ArrayList<>();
        list.forEach(d->{
            int length = d.split(":").length;
            index.add(Long.parseLong(d.split(":")[length-1]));
        });
        index.add(0L);
        return Collections.max(index);
    }
    public static void addQuestionList(String pathRead, Jedis jedis, ObjectiveTest objectiveTest,double score, Subject subject){
        List<Question> questionList = ReadTest.readTest(pathRead);
        long i=getMaxIndex("question",jedis);
        Map<String,String> map;

        if(!jedis.hexists("subjectindex",subject.getName())) {
            map = new HashMap<>();
            map.put("id", String.valueOf(subject.getId()));
            map.put("name", subject.getName());
            if (subject.getPoster() != null)
                map.put("poster", subject.getPoster());
            map.put("type", subject.getType());
            jedis.hmset("subject:" + subject.getId(), map);
            jedis.hsetnx("subjectindex", subject.getName(), "" + subject.getId());
            jedis.sadd("subjecttypeindex:" + subject.getType(), "" + subject.getId());
        }
        else {
            System.out.println("Môn học đã có");
            subject.setId(Long.parseLong(jedis.hget("subjectindex", subject.getName())));
            System.out.println(jedis.hgetAll("subject:"+subject.getId()));
        }

        if(!jedis.hexists("objectivetestindex",objectiveTest.getTestName())) {
            map = new HashMap<>();
            map.put("id", String.valueOf(objectiveTest.getId()));
            map.put("testname", objectiveTest.getTestName());
            map.put("time", String.valueOf(objectiveTest.getTime()));
            if (objectiveTest.getPoster() != null)
                map.put("poster", objectiveTest.getPoster());
            map.put("subject_id",String.valueOf(subject.getId()));
            jedis.hmset("objectivetest:" + objectiveTest.getId(), map);
            jedis.hsetnx("objectivetestindex", objectiveTest.getTestName(), "" + objectiveTest.getId());
            jedis.zadd("objectivetestzset:subject:" + subject.getId(),score, "" + objectiveTest.getId());

            for (Question q : questionList) {
                i++;
                map = new HashMap<>();
                map.put("title", q.getTitle());
                if(q.getSolution()!=null) {
                    map.put("solution", q.getSolution());
                    map.put("solutionHead", String.valueOf(q.getSolutionHead()));
                }
                if (q.getFeedback() != null)
                    map.put("feedback", q.getFeedback());
                if (q.getImage() != null)
                    map.put("image", q.getImage());
                jedis.hmset("question:" + i, map);
                for (Answer answer : q.getAnswers()) {
                    jedis.lpush("answer:question:" + i, answer.getAnswer());
                }
                jedis.sadd("questionset:objectivetest:" + objectiveTest.getId(), String.valueOf(i));
            }
        }
        else{
            System.out.println("Bài trắc nghiệm đã có");
            System.out.println(jedis.hgetAll("objectivetest:"+jedis.hget("objectivetestindex",objectiveTest.getTestName())));
        }
    }
    public static void objectiveTestDel(String oTName, Jedis jedis){
        String i = jedis.hget("objectivetestindex",oTName);
        System.out.println(i);
        if(i!=null) {
            String qset_key = "questionset:objectivetest:" + i;
            Set<String> questionset = jedis.smembers(qset_key);
            System.out.println(questionset);
            Iterator<String> keys = questionset.iterator();
            while (keys.hasNext()) {
                String id = keys.next();
                String key = "question:" + id;
                String a_key = "answer:question:" + id;
                System.out.print(key + " ");
                System.out.print(a_key + " ");
                jedis.del(key);
                jedis.del(a_key);
            }
            String oT_key = "objectivetest:" + i;
            System.out.println("\n" + jedis.hgetAll(oT_key));
            System.out.println(qset_key);
            jedis.del(qset_key);
            String oTs_key = "objectivetestzset:subject:" + jedis.hget(oT_key, "subject_id");
            System.out.println(oTs_key);
            jedis.zrem(oTs_key, i);
            System.out.println(oT_key);
            jedis.del(oT_key);
            String oTi_key = "objectivetestindex";
            System.out.println(oTi_key + "," + oTName);
            jedis.hdel(oTi_key, oTName);
        }
        else System.out.println("Không có bài trắc nghiệm này");
    }
    public static void readListObject (String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        System.out.println(list);
        Iterator<String> keys = list.iterator();
        long len;
        while (keys.hasNext()){
            String key = keys.next();
            len = jedis.llen(key);
            System.out.println(key+" "+jedis.lrange(key,0,len-1));
        }
    }
    public static void readHashObject(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        System.out.println(list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println(key+" "+jedis.hgetAll(key));
        }
    }
    public static void readSetObject(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        System.out.println(list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println(key+" "+jedis.smembers(key));
        }
    }
    public static void readZSetObject(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        System.out.println(list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            Iterator<String> zset = jedis.zrangeByScore(key, "-inf", "+inf").iterator();
            Map<String,Double> map = new HashMap<>();
            while(zset.hasNext()){
                String zkey = zset.next();
                map.put(zkey,jedis.zscore(key,zkey));
            }
            System.out.println(key+" "+ map);
        }
    }
    public static void deleteAllObject(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        System.out.println("deleted:"+list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            jedis.del(key);
        }
    }
    public static void deleteIndex(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+"index");
        System.out.println("deleted:"+list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            jedis.del(key);
        }
    }
    public static void updateHashObject(String pattern,String field, String value,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(pattern);
        System.out.println(list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            jedis.hset(key,field,value);
            System.out.println(key+" "+jedis.hgetAll(key));
        }
    }
    public static void main(String[] args) throws Exception{

        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
//        Jedis jedis = new Jedis("redis-18337.c233.eu-west-1-1.ec2.cloud.redislabs.com", 18337);
//        jedis.auth("fourin1234");
//        System.out.println("Connected to Redis");
//        System.out.println(jedis.keys("*"));
//        ScanResult a = jedis.scan(0);
//        System.out.println(a.getResult());



        //ADD FUNCTION
//        String path = "D:/Du_an_on_thi/txt/";
//        String readname = "phan1_mang_mt_truyen_sl";
//        String pathRead = path+readname+".txt";
//        double score = 10;
//        ObjectiveTest objectiveTest = new ObjectiveTest();
//        objectiveTest.setId(getMaxIndex("objectivetest",jedis)+1);
//        System.out.println(getMaxIndex("objectivetest",jedis)+1);
//        objectiveTest.setTestName(readname);
//        objectiveTest.setTime(0);
//
//        Subject subject = new Subject();
//        subject.setId(getMaxIndex("subject",jedis)+1);
//        System.out.println(getMaxIndex("subject",jedis)+1);
//        subject.setName("Mạng máy tính và truyền số liệu");
//        subject.setPoster("https://drive.google.com/thumbnail?id=122dSEIpF2CyEvz9Qcfb-rWUt4YrDl0jx");
//        subject.setType("chuyên ngành");
//
//        addQuestionList(pathRead,jedis,objectiveTest,score,subject);





        //READ FUNCTION
//        System.out.println(jedis.keys("*index"));
//        System.out.println(jedis.hgetAll("objectivetestindex"));
//        readHashObject("objectivetest",jedis);
//        readListObject("answer:question",jedis);
//        readSetObject("subjecttypeindex",jedis);
//        readZSetObject("objectivetestzset",jedis);
//        System.out.println(getMaxIndex("answer"));











        //UPDATE FUNCTION
//        updateHashObject("objectivetest:11","time","60",jedis);
//        updateHashObject("subject:11","poster","https://drive.google.com/thumbnail?id=122dSEIpF2CyEvz9Qcfb-rWUt4YrDl0jx",jedis);


        //DELETE FUNCTION
//        objectiveTestDel("phan1_mang_mt_truyen_sl",jedis);
//        deleteIndex("*",jedis);
//        deleteAllObject("*",jedis);


        Toolkit.getDefaultToolkit().beep();
    }
} 