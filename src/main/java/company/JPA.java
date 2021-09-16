package company;

import company.entity.ObjectiveTest;
import company.entity.Question;
import company.entity.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class JPA {
    public static void objectiveTestPersist(String path, String readname, Subject csubject){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning");
        EntityManager em = emf.createEntityManager();

        String pathRead = path+readname+"/"+readname+".txt";

//        String queryOT = "Select o from ObjectiveTest o where o.testName = ?1";
//        List<ObjectiveTest> listOT = em.createQuery(queryOT).setParameter(1, readname).getResultList();
//        if(listOT.isEmpty()) {
//            String querySubject = "Select s from Subject s where s.name = ?1";
//            List<Subject> listSubject = em.createQuery(querySubject).setParameter(1, csubject.getName()).getResultList();
            Subject subject;
//            if (listSubject.isEmpty()) {
//                subject = new Subject();
//                subject.setName(csubject.getName());
//                subject.setPoster(csubject.getPoster());
//            } else subject = listSubject.get(0);

            ObjectiveTest objectiveTest = new ObjectiveTest();
            objectiveTest.setTestName(readname);
//            objectiveTest.setSubject(subject);
            List<Question> questionList = ReadTest.readTest(pathRead);
            for (Question question : questionList) {
                System.out.println(question);
//                question.setObjectiveTest(objectiveTest);
            }
            objectiveTest.setQuestions(questionList);
//            subject.getObjectiveTests().add(objectiveTest);

            em.getTransaction().begin();
            for (Question question : questionList) {
                em.persist(question);
            }
            em.persist(objectiveTest);
//            em.persist(subject);
            em.getTransaction().commit();
//        }
//        else System.out.println("Bài trắc nghiệm đã tồn tại");
//        em.close();
//        emf.close();
    }

//    public static void main(String[] args) {
//        String path = "D:/Du_an_on_thi/txt/";
//        Map<String,Subject> oT_to_subject = new HashMap();
//        Subject ktct = new Subject();
//        ktct.setName("Kinh tế chính trị");
//        ktct.setPoster("https://photos.google.com/photo/AF1QipN9-4XKu8W6pvYz_yWmD-MBr6o1x0C8xssD4vul");
//        Subject cnxhkh = new Subject();
//        cnxhkh.setName("Chủ nghĩa xã hội khoa học");
//        Subject pldc = new Subject();
//        pldc.setName("Pháp luật đại cương");
//        pldc.setPoster("https://photos.google.com/photo/AF1QipNF9UZmwWAu3SV2a8c8Xe6PWo7k_euY_bqK3j7-");
//        oT_to_subject.put("chuong3_ktct",ktct);
//        oT_to_subject.put("chuong4_ktct",ktct);
//        oT_to_subject.put("chuong5_cnxhkh",cnxhkh);
//        oT_to_subject.put("chuong6_cnxhkh",cnxhkh);
//        oT_to_subject.put("tong_hop_cnxhkh",cnxhkh);
//        oT_to_subject.put("tong_hop_cnxhkh_2",cnxhkh);
//        oT_to_subject.put("test",pldc);
//
//        Set<String> objectiveTestList = oT_to_subject.keySet();
//        for (String readname: objectiveTestList) {
//            objectiveTestPersist(path,readname,oT_to_subject.get(readname));
//        }
//    }
}
