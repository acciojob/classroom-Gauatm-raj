package com.driver.repository;

import com.driver.Student;
import com.driver.Teacher;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class TeacherRepository {
    HashMap<String , Teacher> teacherDB;

    public TeacherRepository() {
        this.teacherDB = new HashMap<>();
    }


//    public List<Teacher> getAllTeacher(){
//        List<Teacher> teachers=new ArrayList<>();
//        for(String name: teacherDB.keySet()){
//            Teacher s=teacherDB.get(name);
//            teachers.add(s);
//        }
//        return teachers;
//    }

    public Teacher getByName(String name){
        return teacherDB.get(name);
    }

    public void addTeacher(Teacher t){
        String name=t.getName();
        teacherDB.put(name,t);
    }
}
