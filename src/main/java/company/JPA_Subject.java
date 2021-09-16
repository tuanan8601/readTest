package company;

import company.entity.ObjectiveTest;
import company.entity.Question;
import company.entity.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JPA_Subject {
    public static void matchObjectiveTestToSubject(String subjectName,String readname){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning");
        EntityManager em = emf.createEntityManager();

//        String queryCheck = "Select o from ObjectiveTest o join fetch  where o.testName=?1";
//        List<ObjectiveTest> listCheck = em.createQuery(queryCheck).setParameter(1,readname).getResultList();
//        if(listCheck.isEmpty()) {
            em.getTransaction().begin();
//            String querySubject = "Select s from Subject s where s.name = ?1";
//            List<Subject> listSubject = em.createQuery(querySubject).setParameter(1, subjectName).getResultList();
            Subject subject;
//            if (listSubject.isEmpty()) {
//                subject = new Subject();
//                subject.setName(subjectName);
//            } else subject = listSubject.get(0);

//            String queryOT = "Select o from ObjectiveTest o where o.testName = ?1";
//            List<ObjectiveTest> listOT = em.createQuery(queryOT).setParameter(1, readname).getResultList();

//            for (ObjectiveTest ot : listOT) {
//                subject.getObjectiveTests().add(ot);
//            }

//            if (listSubject.isEmpty()) em.persist(subject);

            em.getTransaction().commit();
//        }
//        else System.out.println("Bài trắc nghiệm đã được liên kết");
        em.close();
        emf.close();
    }
//    public static void main(String[] args) {
//        String readname = "chuong4_ktct";
//        String subjectName = "Kinh tế chính trị";
//        matchObjectiveTestToSubject(subjectName,readname);
//    }
}
