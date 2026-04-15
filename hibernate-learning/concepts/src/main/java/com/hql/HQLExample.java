package com.hql;

import com.tut.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class HQLExample {
    public static void main(String[] args){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session s = factory.openSession();
        String query = "from Student";

        Query q = s.createQuery(query);

        //condition on query in hql
        //String query = "from Student where city='Lucknow' ";

        //-->> For Dynamic value put :x & later you can add
        //String query = "from Student where city=:x ";
        //q.setParameter("x","Lucknow");

        //Also have feature like these in query
        //String query = "from student as s where s.city=:x and s.name:=n"
        //q.setParameter("x","Lucknow");
        // q.setParameter("n","John");

        //single result - unique
        //multiple - list

        List<Student> list = q.list();

        for(Student student:list){
            System.out.println(student.getName());
        }

        System.out.println("____________________________________________");

        Transaction tx = s.beginTransaction();

        //--> delete query
//        Query q2 = s.createQuery("delete from student s where s.city=:c");
//        q2.setParameter("c","ABC");
//        int r = q2.executeUpdate();
//        System.out.println("Deleted");
//        System.out.println(r);

           Query q2 =  s.createQuery("update Student set city = :c where name=:n");
            q2.setParameter("c","Delhi");
            q2.setParameter("n","Peter");
            int r = q2.executeUpdate();
             System.out.println(r + "objects updated");
             tx.commit();


         //How to execute join query
            Query q3 = s.createQuery("select q.question ,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");

            List<Object []> list3 = q3.getResultList();

            for(Object[] arr:list3){
                System.out.println(Arrays.toString(arr));
             }
        s.close();
        factory.close();

    }
}
