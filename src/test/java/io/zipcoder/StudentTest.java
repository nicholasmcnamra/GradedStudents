package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String expectedExamScores = "Exam Scores: \n" + 100.0 + "\n" + 95.0;
        String actualExamScores = student.getExamScores(examScores);

        // Then
        Assert.assertEquals(expectedExamScores, actualExamScores);
        }

        @Test
        public void addExamScoreTest() {
            // : Given
            String firstName = "Leon";
            String lastName = "Hunter";
            ArrayList<Double> examScores = new ArrayList<>();
            examScores.add(100.0);
            Student student = new Student(firstName, lastName, examScores);

            // When
            String expectedExamScore = "Exam Scores: \n" + 100.0;
            String actualExamScore = student.getExamScores(examScores);

            // Then
            Assert.assertEquals(expectedExamScore, actualExamScore);
        }

        @Test
        public void setExamScoreTest() {
            // : Given
            String firstName = "Leon";
            String lastName = "Hunter";
            ArrayList<Double> examScores = new ArrayList<>();
            examScores.add(100.0);
            Student student = new Student(firstName, lastName, examScores);
            student.setExamScore(0, 150.0);
            // When
            String expectedExamScore = "Exam Scores: \n" + 150.0;
            String actualExamScore = student.getExamScores(examScores);

            // Then
            Assert.assertEquals(expectedExamScore, actualExamScore);
        }

        
    }