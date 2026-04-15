package com.map2;

import com.map.Answer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo  {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        //creating quesion
        Question2 q1 = new Question2();
        q1.setQuestionId(1212);
        q1.setQuestion("What is java?");

        //creating answer
        Answer2 answer = new Answer2();
        answer.setAnswerId(343);
        answer.setAnswer("Java is programming language");
        answer.setQuestion(q1);

        Answer2 answer1 = new Answer2();
        answer1.setAnswerId(33);
        answer1.setAnswer("with java we can create softwares");
        answer1.setQuestion(q1);

        Answer2 answer2 = new Answer2();
        answer2.setAnswerId(34);
        answer2.setAnswer("java has diff frameworks");
        answer2.setQuestion(q1);

        List<Answer2> list = new ArrayList<Answer2>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);

        q1.setAnswer(list);




        //session

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        //save

        s.persist(q1);




        tx.commit();

        Question2 q = s.find(Question2.class,1212);
        System.out.println(q.getQuestion());

        for(Answer2 a: q.getAnswer()){
            System.out.println(a.getAnswer());
        }

//        //fetching...
//        Question2 newQ = s.find(Question2.class,1212);
//        System.out.println(newQ.getQuestion());
//        System.out.println(newQ.getAnswer().getAnswer());
        s.close();


        factory.close();
    }
}
