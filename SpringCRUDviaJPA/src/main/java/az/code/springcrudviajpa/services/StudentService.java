package az.code.springcrudviajpa.services;

import az.code.springcrudviajpa.models.Student;
import az.code.springcrudviajpa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(s->students.add(s));
        return students;
    }
    public Student getStudentById(int id){
        return studentRepository.findById(id).get();
    }
    //----------------------------------
    public Student saveOrUpdate(Student student){
        studentRepository.save(student);
        return student;
    }
    //---------------------------------
    public void delete(int id){
        studentRepository.deleteById(id);
    }
    //---------------------------
    public void update(Student student, int studentid){
        studentRepository.save(student);
    }
}