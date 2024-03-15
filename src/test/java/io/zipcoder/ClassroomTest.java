package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ClassroomTest {

    Student[] students = new Student[0];
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

    @Test
    public void addStudentToClassroomTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When


        int expectedNumberOfStudents = classroom.getStudents().length + 1;
        classroom.addStudent(student);
        int actualNumberOfStudents = classroom.getStudents().length;

        Assert.assertEquals(expectedNumberOfStudents, actualNumberOfStudents);
    }

    @Test
    public void removeStudentTest() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);

        int expectedNumberOfStudents = classroom.getStudents().length - 1;
        classroom.removeStudent("Leon", "Hunter");
        int actualNumberOfStudents = classroom.getStudents().length;

        Assert.assertEquals(expectedNumberOfStudents, actualNumberOfStudents);
    }

    @Test
    public void getStudentsByScoreAverageTest() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
        Double[] examScores2 = { 95.0, 300.0, 90.0, 100.0 };
        Student student1 = new Student("Leon", "Hunter", examScores1);
        Student student2 = new Student("May", "Dobbs", examScores2);
        Student[] students = {student1, student2};
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        Student[] expectedStudents = {student2, student1};
        Student[] actualStudents = classroom.getStudentsByScoreAverage(students);

        Assert.assertEquals(expectedStudents, actualStudents);

    }
}
