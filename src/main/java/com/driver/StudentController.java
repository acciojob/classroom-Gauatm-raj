package com.driver;

import java.util.List;

import com.driver.service.StudentService;
import com.driver.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);

        return new ResponseEntity<>("New student added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add-teacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){
         teacherService.addTeacher(teacher);
        return new ResponseEntity<>("New teacher added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/add-student-teacher-pair")
    public ResponseEntity<String> addStudentTeacherPair(@RequestParam String student, @RequestParam String teacher){
         studentService.addTeacherToStudent(student,teacher);
         teacherService.addStudentToTeacher(student,teacher);
        return new ResponseEntity<>("New student-teacher pair added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name){
        Student student = null; // Assign student by calling service layer method
        student=studentService.getByName(name);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/get-teacher-by-name/{name}")
    public ResponseEntity<Teacher> getTeacherByName(@PathVariable String name){
        Teacher teacher = null; // Assign student by calling service layer method
        teacher=teacherService.getByName(name);

        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    @GetMapping("/get-students-by-teacher-name/{teacher}")
    public ResponseEntity<List<String>> getStudentsByTeacherName(@PathVariable String teacher){
         List<String> students = null; // Assign list of student by calling service layer method
           students = teacherService.getStudentName(teacher);
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = null; // Assign list of student by calling service layer method
        students=studentService.getAllStudent();


        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-teacher-by-name")
    public ResponseEntity<String> deleteTeacherByName(@RequestParam String teacher){
          teacherService.deleteByName(teacher);
        return new ResponseEntity<>(teacher + " removed successfully", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-all-teachers")
    public ResponseEntity<String> deleteAllTeachers(){
         teacherService.deleteAll();
        return new ResponseEntity<>("All teachers deleted successfully", HttpStatus.CREATED);
    }
}
