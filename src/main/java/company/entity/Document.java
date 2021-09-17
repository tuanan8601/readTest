package company.entity;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Document {
    int id;
    String docName;
//    ObjectId subject_id;
    int subject_id;
    String poster;
    String link;
}
