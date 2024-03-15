package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] students = new Student[0];
    private int maxNumberStudents;

    Student student = new Student("Joe", "Smith", new Double[]{100.0});

    public Classroom(int maxNumberStudents) {
        this.maxNumberStudents = maxNumberStudents;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }


    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double totalExamSum = 0.0;
        for (int i = 0; i < students.length; i++) {
            for (Student student : students) {
                totalExamSum += student.getAverageExamScore();
            }
        }
        return totalExamSum/students.length;
    }

    public void addStudent(Student student) {
        Student[] preEnrollment = getStudents();
        students = new Student[getStudents().length + 1];

        for (int i = 0; i < preEnrollment.length; i++) {
            students[i] = preEnrollment[i];
        }
        students[students.length-1] = student;
    }

    public void removeStudent(String firstName, String lastName) {
        Student[] removedStudents = getStudents();
        students = new Student[getStudents().length-1];
        for (int i = 0; i < students.length; i++) {
            if (!student.getLastName().equals(firstName) && student.getLastName().equals(lastName)) {
                students[i] = removedStudents[i] ;
            }
        }
    }
}
