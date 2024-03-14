package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores(ArrayList examScores) {
        String examScoreList = "Exam Scores: ";
        for (int i = 0; i < examScores.size(); i++) {
            examScoreList += ("\n" + examScores.get(i));
        }

        return examScoreList;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    //There needs to be a better way to write this one. I know it's wrong..
    public void setExamScore(double examIndex, double newScore) {
                examScores.set(0, newScore);
            }

    public double getAverageExamScore(ArrayList examScores) {
        double averageExamScore = 0;
        for (int i = 0; i < examScores.size(); i++) {
            averageExamScore += ((Double) examScores.get(i));
        }
        averageExamScore = averageExamScore / examScores.size();
        return averageExamScore;
    }

    public int getNumberOfExamsTaken(ArrayList examScores) {
        return examScores.size();
    }

}
