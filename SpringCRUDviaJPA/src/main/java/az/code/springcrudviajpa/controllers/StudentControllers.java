package az.code.springcrudviajpa.controllers;


import az.code.springcrudviajpa.models.Student;
import az.code.springcrudviajpa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.List;

@RestController
public class StudentControllers {
    @Autowired
    StudentService studentService;

    //-------------------------------
    @GetMapping("/student")
    private List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //--------------------------------
    @GetMapping("/student/{studentid}")
    private Student getStudents(@PathVariable("studentid") int studentid) {
        return studentService.getStudentById(studentid);
    }

    //----------------------
    @DeleteMapping("/student/{studentid}")
    private void deleteStudent(@PathVariable("studentid") int studentid) {
        studentService.delete(studentid);
    }
    //----------------------------
    @PostMapping("/students")
    private int saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getId();
    }
    //-----------------------------
    @PutMapping("/students")
    private Student update(@RequestBody Student students){
        return studentService.saveOrUpdate(students);
    }
    //-------------------------
}
