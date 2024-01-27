package com.driver.service;

import com.driver.Teacher;
import com.driver.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

//    public List<Teacher> getAllTeacher(){
//        return teacherRepository.getAllTeacher();
//    }

    public Teacher getByName(String name){
        return teacherRepository.getByName(name);
    }

    public void addTeacher(Teacher t){
        teacherRepository.addTeacher(t);
    }

   public void addStudentToTeacher(String student,String teacher){
        Teacher t=teacherRepository.getByName(teacher);
        t.getStudents().add(student);

       // teacherRepository.addStudentInTeacher(student,teacher);
   }

   public List<String> getStudentName(String teacher){
        return teacherRepository.getStudentName(teacher);
   }

   public void deleteByName(String name){
         teacherRepository.deleteByName(name);
   }

   public void deleteAll(){
        teacherRepository.deleteall();
   }

}
