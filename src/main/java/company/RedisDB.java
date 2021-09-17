package company;

import company.entity.Answer;
import company.entity.ObjectiveTest;
import company.entity.Question;
import company.entity.Subject;
import redis.clients.jedis.Jedis;

import java.util.*;

public class RedisDB {
    public static long getMaxIndex(String objectname){
        Jedis jedis = new Jedis("localhost");
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        List<Long> index = new ArrayList<>();
        list.forEach(d->{
            int length = d.split(":").length;
            index.add(Long.parseLong(d.split(":")[length-1]));
        });
        index.add(0L);
        return Collections.max(index);
    }
    public static void addQuestionList(String pathRead, Jedis jedis, ObjectiveTest objectiveTest, Subject subject){
        List<Question> questionList = ReadTest.readTest(pathRead);
        long i=getMaxIndex("question");
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
        }

        if(!jedis.hexists("objectivetestindex",objectiveTest.getTestName())) {
            map = new HashMap<>();
            map.put("id", String.valueOf(objectiveTest.getId()));
            map.put("testname", objectiveTest.getTestName());
            if (objectiveTest.getPoster() != null)
                map.put("poster", objectiveTest.getPoster());
            map.put("subject_id",String.valueOf(subject.getId()));
            jedis.hmset("objectivetest:" + objectiveTest.getId(), map);
            jedis.hsetnx("objectivetestindex", objectiveTest.getTestName(), "" + objectiveTest.getId());
            jedis.sadd("objectivetestset:subject:" + subject.getId(), "" + objectiveTest.getId());

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
        else System.out.println("Bài trắc nghiệm đã có");
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
            String oTs_key = "objectivetestset:subject:" + jedis.hget(oT_key, "subject_id");
            System.out.println(oTs_key);
            jedis.srem(oTs_key, i);
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
            System.out.println(key+" "+jedis.lrange(key,1,len));
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
    public static void main(String[] args) {
        String path = "D:/Du_an_on_thi/txt/";
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");





//        String readname = "phan1_htttql";
//        String pathRead = path+readname+".txt";
//
//        ObjectiveTest objectiveTest = new ObjectiveTest();
//        objectiveTest.setId(getMaxIndex("objectivetest")+1);
//        objectiveTest.setTestName(readname);
//
//        Subject subject = new Subject();
//        subject.setId(getMaxIndex("subject")+1);
//        subject.setName("Hệ thống thông tin quản lý");
//        subject.setPoster("");
//        subject.setType("chuyên ngành");
//
//        addQuestionList(pathRead,jedis,objectiveTest,subject);






//        objectiveTestDel("minh_hoa_vi_mo",jedis);
//        System.out.println(jedis.hgetAll("objectivetestindex"));
//        deleteIndex("*",jedis);
//        deleteAllObject("*",jedis);
//        readHashObject("question",jedis);
//        readListObject("answer:question",jedis);
//        readSetObject("objectivetestset:*",jedis);
//        System.out.println(getMaxIndex("answer"));
    }
} 