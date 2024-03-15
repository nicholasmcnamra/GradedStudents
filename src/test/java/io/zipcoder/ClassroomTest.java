package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        Double totalExamSum = 0.0;
        for (int i = 0; i < students.length; i++) {
            for (Student student : students) {
                totalExamSum += student.getAverageExamScore();
            }
        }

        Double expectedAverageExamScore = totalExamSum/students.length;
        // When
        Double actualAverageExamScore = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expectedAverageExamScore, actualAverageExamScore);
    }
}
