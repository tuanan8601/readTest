package company.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class ObjectiveTest {
    String testName;
    ObjectId subject_id;
    String poster;
    List<Question> questions = new ArrayList<>();
}
