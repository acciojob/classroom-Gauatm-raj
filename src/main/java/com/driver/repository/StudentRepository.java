package com.driver.repository;

import com.driver.Student;
import com.driver.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {



    HashMap<String, Student> studentDB;



    public StudentRepository(){
        studentDB=new HashMap<>();
    }

    public List<String> getAllStudent(){
        List<String> students=new ArrayList<>();
        for(String name: studentDB.keySet()){
            students.add(name);
        }
         return students;
    }

   public Student getByName(String name){
        return studentDB.get(name);
   }

   public void addStudent(Student s){
      String name=s.getName();
      studentDB.put(name,s);
   }

//   public void addStudentToTeacher(String student,String teacher){
//        Student s=studentDB.get(student);
//        s.getTeachers().add(teacher);
//   }


}
