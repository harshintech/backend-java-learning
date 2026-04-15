package com.map2;

import com.map.Answer;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question2 {

    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;


    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer2> answer;

    public Question2(int questionId, String question, List<Answer2> answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question2() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer2> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer2> answer) {
        this.answer = answer;
    }
}
