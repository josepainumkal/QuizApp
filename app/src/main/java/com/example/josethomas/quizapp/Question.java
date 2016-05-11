package com.example.josethomas.quizapp;

/**
 * Created by JoseThomas on 3/31/2016.
 */
public class Question {
    private int id;
    private String question;
    private String optA;
    private String optB;
    private String optC;
    private String answer;

    public Question(){
        id=0;
        question = "";
        optA = "";
        optB = "";
        optC = "";
        answer = "";
    }

    public Question(String question, String optA, String optB, String optC, String answer){
        this.question = question;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.answer = answer;
    }


    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOptC() {
        return optC;
    }

    public String getOptB() {
        return optB;
    }

    public String getOptA() {
        return optA;
    }

    public String getQuestion() {
        return question;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptA(String optA) {
        this.optA = optA;
    }

    public void setOptB(String optB) {
        this.optB = optB;
    }

    public void setOptC(String optC) {
        this.optC = optC;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
