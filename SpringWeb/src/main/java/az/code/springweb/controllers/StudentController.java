package az.code.springweb.controllers;


import az.code.springweb.models.Student;
import az.code.springweb.services.StudentService;
import az.code.springweb.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(IntStream.range(1, 10).mapToObj(id -> Student.builder().id(id)
                .name("Name." + id).surname("Surname." + id)
                .build()).collect(Collectors.toList()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        return new ResponseEntity<>(Student.builder().id(id)
                .name("Name." + id).surname("Surname." + id).build(), HttpStatus.OK);
    }


    @GetMapping("/find")
    public ResponseEntity<List<Student>> find(@RequestParam String name, @RequestParam String surname) {
        return new ResponseEntity<>(Arrays.asList(Student.builder().id(1)
                .name(name).surname(surname).build()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<>(student.toBuilder().id(1).build(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {
        return new ResponseEntity<>(student.toBuilder().id(id).build(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}