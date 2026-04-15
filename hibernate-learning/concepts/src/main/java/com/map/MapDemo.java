package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo  {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        //creating quesion
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is java?");

        //creating answer
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is programming language");
        q1.setAnswer(answer);
        answer.setQuestion(q1);

        //creating quesion
        Question q2 = new Question();
        q2.setQuestionId(242);
        q2.setQuestion("What is collection framework ? ");

        //creating answer
        Answer answer2 = new Answer();
        answer2.setAnswerId(344);
        answer2.setAnswer("API to work with objects in java");
        q2.setAnswer(answer2);
        answer2.setQuestion(q2);


        //session

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        //save

        s.persist(q1);
        s.persist(q2);



        tx.commit();

        //fetching...
        Question newQ = s.find(Question.class,1212);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswer());
        s.close();


        factory.close();
    }
}
