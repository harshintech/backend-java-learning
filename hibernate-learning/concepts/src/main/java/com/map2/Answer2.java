package com.map2;

import jakarta.persistence.*;

@Entity
public class Answer2 {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

    @ManyToOne
    private Question2 question;

    public Question2 getQuestion() {
        return question;
    }

    public void setQuestion(Question2 question) {
        this.question = question;
    }



    public Answer2() {
    }

    public Answer2(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
