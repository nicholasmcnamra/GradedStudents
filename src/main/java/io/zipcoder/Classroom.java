package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] students;
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
}
