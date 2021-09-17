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
            jedis.sadd("objectivetestset:" + subject.getId(), "" + objectiveTest.getId());
        }
        else System.out.println("Môn học đã có");

        if(!jedis.hexists("objectivetestindex",objectiveTest.getTestName())) {
            map = new HashMap<>();
            map.put("id", String.valueOf(objectiveTest.getId()));
            map.put("testname", objectiveTest.getTestName());
            if (objectiveTest.getPoster() != null)
                map.put("poster", objectiveTest.getPoster());
            jedis.hmset("objectivetest:" + objectiveTest.getId(), map);
            jedis.hsetnx("objectivetestindex", objectiveTest.getTestName(), "" + objectiveTest.getId());

            for (Question q : questionList) {
                i++;
                map = new HashMap<>();
                map.put("title", q.getTitle());
                map.put("solution", q.getSolution());
                map.put("solutionHead", String.valueOf(q.getSolutionHead()));
                if (q.getFeedback() != null)
                    map.put("feedback", q.getFeedback());
                if (q.getImage() != null)
                    map.put("image", q.getFeedback());
                jedis.hmset("question:" + i, map);
                for (Answer answer : q.getAnswers()) {
                    jedis.lpush("answer:question:" + i, answer.getAnswer());
                }
                jedis.sadd("questionset:objectivetest:" + objectiveTest.getId(), String.valueOf(i));
            }
        }
        else System.out.println("Bài trắc nghiệm đã có");
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




//        String readname = "tong_hop_cnxhkh";
//        String pathRead = path+readname+".txt";
//
//        ObjectiveTest objectiveTest = new ObjectiveTest();
//        objectiveTest.setId(getMaxIndex("objectivetest")+1);
//        objectiveTest.setTestName(readname);
//
//        Subject subject = new Subject();
//        subject.setId(getMaxIndex("subject")+1);
//        subject.setName("Chủ nghĩa xã hội khoa học");
//        subject.setPoster("");
//        subject.setType("đại cương");
//
//        addQuestionList(pathRead,jedis,objectiveTest,subject);




//        System.out.println(jedis.hgetAll("subjectindex"));
//        deleteIndex("*",jedis);
//        deleteAllObject("*",jedis);
//        readHashObject("question",jedis);
//        readListObject("question",jedis);
//        readSetObject("subjectindex",jedis);
//        System.out.println(getMaxIndex("answer"));
    }
} 