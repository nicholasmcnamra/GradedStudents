package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private Double[] examScores = new Double[1];


    
    public Student(String firstName, String lastName, Double[] examScores) {
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

    public String getExamScores() {
        String returnExamScores = "Exam Scores: ";

        for (int i = 0; i < examScores.length; i++) {
            returnExamScores += "\n" + examScores[i];
        }
        return returnExamScores;
    }

    public void addExamScore(double examScore) {
        Double[] updatedExamScores = new Double[examScores.length+1];
        for (int i = 0; i < updatedExamScores.length; i++) {
            updatedExamScores[i] = examScores[i];
        }
        updatedExamScores[updatedExamScores.length-1] = examScore;
    }

    public void setExamScore(int index, double examScoreUpdate) {
        examScores[index] = examScoreUpdate;
    }

    @Override
    public String toString() {
        return "Student Name: " + getFirstName() + " " + getLastName() + "\n Average Score: ";
    }

    public Double getAverageExamScore() {
        Double examScoreSum = 0.0;
        for (int i = 0; i < examScores.length; i++) {
            examScoreSum += examScores[i];
        }
        return examScoreSum/examScores.length;
    }

    public int getNumberOfExamsTaken(Double[] examScores) {
        return examScores.length;
    }

}
