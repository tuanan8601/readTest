package company;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import company.entity.ObjectiveTest;
import company.entity.Question;
import company.entity.Subject;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class MongoDB {

    public static void addSubject(MongoDatabase db, Subject subject){
        MongoCollection<Subject> subjects = db.getCollection("subjects", Subject.class);
        subjects.insertOne(subject);
    }

    public static void addOTToSubject(MongoDatabase db,
                                      ObjectiveTest objectiveTest,
                                      String subjectname){
        MongoCollection<ObjectiveTest> objective_tests = db.getCollection("objective_tests", ObjectiveTest.class);
        MongoCollection<Document> objective_tests_doc = db.getCollection("objective_tests");
        MongoCollection<Subject> subjects = db.getCollection("subjects", Subject.class);
        MongoCollection<Document> subjects_doc = db.getCollection("subjects");
        Document s = subjects_doc.find(eq("name",subjectname)).first();
        if(s!=null && objective_tests.find(eq("testName",objectiveTest.getTestName())).first()==null) {
            System.out.println(s);
            ObjectId subjectid = (ObjectId) s.get("_id");
            objectiveTest.setSubject_id(subjectid);
            objective_tests.insertOne(objectiveTest);
            FindIterable<Document> oList = objective_tests_doc.find(eq("subject_id",(ObjectId)s.get("_id")));
            if(oList.first()!=null){
                Map<String,ObjectId> objectiveTest_map = new HashMap<>();
                oList.forEach(doc -> objectiveTest_map.put(doc.getString("testName"),(ObjectId)doc.get("_id")));
                if(subjects_doc.find(eq("name",subjectname)).first()!=null) {
                    subjects.updateOne(eq("name", subjectname), set("objectiveTest_map", objectiveTest_map));
                }
                else System.out.println("Không update được");
            }
            else System.out.println("Không có bài trắc nghiệm này");
        }
        else System.out.println("Không thêm bài trắc nghiệm nào");
    }

    public static void main(String[] args) {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        ConnectionString connectionString = new ConnectionString("mongodb+srv://tuanan8601:fourin1234@cluster0.u4rda.mongodb.net");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(pojoCodecRegistry)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase db = mongoClient.getDatabase("Learning");

        MongoCollection<Subject> subjects = db.getCollection("subjects", Subject.class);
        subjects.deleteOne(eq("_id",new ObjectId("61343977928ba1565ab15a70")));

//        ObjectId i = new ObjectId();
//        Subject subject = new Subject();
//        subject.setName("Kinh tế vi mô");
//        subject.setPoster("");
//        subject.setType("đại cương");
//        subject.getObjectiveTest_map().put("",i);
//        addSubject(db,subject);

//        String path = "D:/Du_an_on_thi/txt/";
//        List<String> readnames=new ArrayList<>();
//        readnames.add("minh_hoa_vi_mo");
//        String subjectname = "Kinh tế vi mô";
//        for (String readname: readnames) {
//            String pathRead = path + readname + ".txt";
//            ObjectiveTest objectiveTest = new ObjectiveTest();
//            objectiveTest.setTestName(readname);
//            List<Question> questionList = ReadTest.readTest(pathRead);
//            objectiveTest.setQuestions(questionList);
//            addOTToSubject(db, objectiveTest, subjectname);
//        }

        mongoClient.close();
    }
}
