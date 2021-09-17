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
//    int id;
    String name;
    String type;
    String poster;
    Map<String,ObjectId> objectiveTest_map = new HashMap();
//    Map<String,Integer> objectiveTest_id = new HashMap<>();
}

