package company;

import company.entity.Answer;
import company.entity.ObjectiveTest;
import company.entity.Question;
import company.entity.Subject;
import redis.clients.jedis.Jedis;

import java.util.*;

public class TestCode {
    public static int getMaxIndex(String objectname){
        Jedis jedis = new Jedis("localhost");
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        List<Integer> index = new ArrayList<>();
        list.forEach(d->{
            int length = d.split(":").length;
            index.add(Integer.parseInt(d.split(":")[length-1]));
        });
        index.add(0);
        return Collections.max(index);
    }
    public static void addQuestionList(String pathRead, Jedis jedis, ObjectiveTest objectiveTest, Subject subject){
        List<Question> questionList = ReadTest.readTest(pathRead);
        int i=getMaxIndex("question");
        Map<String,String> map;
        for (Question q:questionList) {
            i++;
            map=new HashMap<>();
            map.put("title",q.getTitle());
            map.put("solution",q.getSolution());
            map.put("solutionHead",String.valueOf(q.getSolutionHead()));
            if(q.getFeedback()!=null)
                map.put("feedback",q.getFeedback());
            else
                map.put("feedback","nil");
            if(q.getFeedback()!=null)
                map.put("image",q.getFeedback());
            else
                map.put("image","nil");
            jedis.hmset("question:"+i,map);
            for (Answer answer:q.getAnswers()) {
                jedis.lpush("answer:question:"+i,answer.getAnswer());
            }
        }
    }
    public static void readListObject (String objectname,Jedis jedis){

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
    public static void deleteAllObject(String objectname,Jedis jedis){
        HashSet<String> list = (HashSet<String>) jedis.keys(objectname+":*");
        System.out.println(list);
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            jedis.del(key);
        }
    }
    public static void main(String[] args) {
        String path = "D:/Du_an_on_thi/txt/";
        String readname = "tong_hop_cnxhkh";
        String pathRead = path+readname+".txt";

        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");

        ObjectiveTest objectiveTest = new ObjectiveTest();
        Subject subject = new Subject();

        addQuestionList(pathRead,jedis,objectiveTest,subject);
//        deleteAllObject("question",jedis);
//        readHashObject("question",jedis);
        System.out.println(getMaxIndex("question"));
    }
} 