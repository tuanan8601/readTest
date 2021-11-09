package company.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class ObjectiveTest {
    long id;
    String testName;
//    ObjectId subject_id;
    long subject_id;
    String poster;
    long time;
    List<Question> questions = new ArrayList<>();
}
