package company;

import company.entity.Comment;
import redis.clients.jedis.Jedis;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RedisCommentTest {
    public static void addComment(Comment comment,Jedis jedis){
        Map<String,String> map = new HashMap<>();
        map.put("id",String.valueOf(comment.getId()));
        map.put("name",comment.getName());
        map.put("email",comment.getEmail());
        map.put("text",comment.getText());
        map.put("objectiveTest_id",String.valueOf(comment.getObjectiveTest_id()));
        map.put("date",String.valueOf(comment.getDate().getTime()));
        System.out.println(map);
        jedis.hmset("comment:"+comment.getId(),map);
    }
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        Comment comment = new Comment();
        comment.setEmail("tuanan8601@gmail.com");
        comment.setId(RedisDB.getMaxIndex("comment",jedis)+1);
        comment.setName("Tuấn An Nguyễn");
        comment.setText("Wow! Amazing");
        comment.setObjectiveTest_id(8);
        comment.setDate(new Date());
        System.out.println(comment);
//        addComment(comment,jedis);
        RedisDB.readHashObject("comment",jedis);
    }
}
