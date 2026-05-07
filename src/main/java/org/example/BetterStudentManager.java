package org.example;

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {

    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {

        Student student = new Student();

        student.name = name;
        student.grade = grade;

        students.add(student);
    }

    public void removeStudent(String name) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).name.equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    public String getStudentList() {

        StringBuilder result = new StringBuilder();

        for (Student student : students) {

            result.append(student.name).append(" ").append(student.grade).append("\n");
        }

        return result.toString();
    }
}