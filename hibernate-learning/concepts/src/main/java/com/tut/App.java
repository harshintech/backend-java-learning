package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Project Started ....." );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        //creating student
        Student st = new Student();
        st.setId(101);
        st.setName("John");
        st.setCity("Delhi");
        System.out.println(st);

        //creating obj of Address classs
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("DELHI");
        ad.setOpen(true);
        ad.setAddedDate(LocalDate.now());
        ad.setX(321.23);


        //reading image
        FileInputStream fis = new FileInputStream("src/main/java/retre.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);


        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(st);
        session.persist(ad);

        session.getTransaction().commit();

        session.close();
        System.out.println("Done...");

    }
}
