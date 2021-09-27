package company.entity;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Document {
    String id;
    String docName;
//    ObjectId subject_id;
    long subject_id;
    String link;
}
