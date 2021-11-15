package company;

import company.entity.Comment;
import redis.clients.jedis.Jedis;

import java.time.Instant;
import java.util.*;

public class RedisCommentTest {
//    public static void addComment(Comment comment,Jedis jedis){
//        Map<String,String> map = new HashMap<>();
//        map.put("id",String.valueOf(comment.getId()));
//        map.put("name",comment.getName());
//        map.put("email",comment.getEmail());
//        map.put("text",comment.getText());
//        map.put("objectiveTest_id",String.valueOf(comment.getObjectiveTest_id()));
//        map.put("date",String.valueOf(comment.getDate().getTime()));
//        System.out.println(map);
//        jedis.set("maxcomment",""+comment.getId());
//        jedis.hmset("comment:"+comment.getId(),map);
//        jedis.zadd("commentzset:objectivetest:"+comment.getObjectiveTest_id(),comment.getDate().getTime(),""+comment.getId());
//    }
    public static void deleteComment(String id,Jedis jedis){
        Iterator<String> keys = jedis.keys("comment:"+id).iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key);
            String comment_id = key.split(":")[1];
            String ojt_id = jedis.hget(key,"objectiveTest_id");
            System.out.println("commentzset:objectivetest:"+ojt_id+" "+comment_id);
            jedis.zrem("commentzset:objectivetest:"+ojt_id,comment_id);
            jedis.del(key);
        }
    }
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");


        //ADD FUNCTION
//        Comment comment = new Comment();
//        comment.setEmail("tuanan8601@gmail.com");
//        comment.setId(RedisDB.getMaxIndex("comment",jedis)+1);
//        comment.setName("Tuấn An Nguyễn");
//        comment.setText("Thank you");
//        comment.setObjectiveTest_id(4);
//        comment.setDate(new Date());
//        System.out.println(comment);
//        addComment(comment,jedis);



        //READ FUNCTION
//        RedisDB.readHashObject("comment",jedis);
//        RedisDB.readZSetObject("commentzset",jedis);



        //DELETE FUNCTION
//        deleteComment("",jedis);
//        jedis.set("maxcomment",RedisDB.getMaxIndex("comment",jedis)+"");
    }
}
