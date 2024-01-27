package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private double averageScore;

    List<Teacher> teachers;

    public Student(){

    }

    public Student(String name, int age, double averageScore, List<Teacher> teachers) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
