package com.sqlquery;

import com.tut.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.Arrays;
import java.util.List;

public class SQLExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session s = factory.openSession();

        String q = "select * from student";


        //native query means it's a data base pure query
        NativeQuery nq = s.createNativeQuery(q);

        List<Object []> list = nq.list();

        for(Object[] student:list){
//            System.out.println(Arrays.toString(student));
            System.out.println(student[4] + " : "+student[3]);

        }
    }
}
