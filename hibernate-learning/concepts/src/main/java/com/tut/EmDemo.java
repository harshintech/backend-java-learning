package com.tut;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        Configuration cfg = new org.hibernate.cfg.Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Student student1 = new Student();
        student1.setId(2432);
        student1.setName("Deon Joe");
        student1.setCity("LKO");

        Certificate certificate = new Certificate();

        certificate.setCourse("Android");
        certificate.setDuration("2 months");
        student1.setCerti(certificate);

        Student student2 = new Student();
        student2.setId(1232);
        student2.setName("Lily Doe");
        student2.setCity("DGK");

        Certificate certificate1 = new Certificate();

        certificate1.setCourse("IOS");
        certificate1.setDuration("1 months");
        student2.setCerti(certificate1);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(student1);
        session.persist(student2);


        tx.commit();
        session.close();


        factory.close();

    }
}
