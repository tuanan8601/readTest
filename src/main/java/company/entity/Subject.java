package company.entity;

import lombok.Data;
import org.bson.types.ObjectId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Subject {
    long id;
    String name;
    String type;
    String poster;
//    Map<String,ObjectId> objectiveTest_map = new HashMap();
    Map<String,Long> objectiveTest_id = new HashMap<>();
//    ObjectId document_id;
    long document_id;
}

