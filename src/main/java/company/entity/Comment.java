package company.entity;

import company.utils.MyTime;
import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    //    private ObjectId id;
    long id;
    private String name;
    private String email;
    private String photoURL;
    private String text;
    //    private ObjectId objectiveTest_id;
    long objectiveTest_id;
    private Date date;
    public String getTimeAgo() {
        return MyTime.timeAgo(new Date(), date);
    }
}
