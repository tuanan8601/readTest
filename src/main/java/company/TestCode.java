package company;

import company.entity.Question;
import redis.clients.jedis.Jedis;

import java.util.*;

public class TestCode {
    public static int getMaxQuestionIndex(){
        Jedis jedis = new Jedis("localhost");
        HashSet<String> list = (HashSet<String>) jedis.keys("question:*");
        List<Integer> index = new ArrayList<>();
        list.forEach(d->{
            index.add(Integer.parseInt(d.split(":")[1]));
        });
        return Collections.max(index);
    }
    public static void main(String[] args) {
        String path = "D:/Du_an_on_thi/txt/";
        String readname = "tong_hop_cnxhkh";
        String pathRead = path+readname+".txt";

        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");

//        List<Question> questionList = ReadTest.readTest(pathRead);
//        int i=getMaxQuestionIndex();
//        Map<String,String> map;
//        for (Question q:questionList) {
//            i++;
//            map=new HashMap<>();
//            map.put("title",q.getTitle());
//            map.put("solution",q.getSolution());
//            map.put("solutionHead",String.valueOf(q.getSolutionHead()));
//            if(q.getFeedback()!=null)
//                map.put("feedback",q.getFeedback());
//            else
//                map.put("feedback","nil");
//            jedis.hmset("objectiveTest:1.question:"+i,map);
//        }

        HashSet<String> list = (HashSet<String>) jedis.keys("question:*");
        Iterator<String> keys = list.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println(key+" "+jedis.hgetAll(key));
        }
    }
} 