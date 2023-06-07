package org.example;

import java.util.ArrayList;

public class Intelligence {
    private String name;
    private ArrayList<Question> questionsList;

    private int points;

    public Intelligence(String name, ArrayList<Question> questionsList) {
        this.name = name;
        this.questionsList = questionsList;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(ArrayList<Question> questionsList) {
        this.questionsList = questionsList;
    }

    @Override
    public String toString() {
        return "Intelligence{" +
                "name='" + name + '\'' +
                ", questionsList=" + questionsList +
                '}';
    }
}
