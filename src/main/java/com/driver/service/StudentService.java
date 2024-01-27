package com.driver.service;

import com.driver.Student;
import com.driver.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<String> getAllStudent(){
        return studentRepository.getAllStudent();
    }

    public Student getByName(String name){
        return studentRepository.getByName(name);
    }
    public void addStudent(Student s){
       studentRepository.addStudent(s);
    }

    public void addTeacherToStudent(String student ,String teacher){
        Student s=studentRepository.getByName(student);
        s.getTeachers().add(teacher);
        //studentRepository.addStudentToTeacher(student,teacher);
    }


}
