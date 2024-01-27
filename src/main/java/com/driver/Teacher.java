package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;
    private List<Student> students;

    public Teacher() {

    }

    public Teacher(String name, int numberOfStudents, int age, List<Student> students) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}