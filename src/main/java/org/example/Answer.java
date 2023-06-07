package org.example;

public class Answer {
    private String answer;
    private int points;

    public Answer(String answer, int points) {
        this.answer = answer;
        this.points = points;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", points=" + points +
                '}';
    }
}
