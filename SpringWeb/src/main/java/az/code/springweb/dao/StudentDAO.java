package az.code.springweb.dao;

import az.code.springweb.models.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAll();
    List<Student> find(String name, String surname);
    Student getById(int id);
    Student save(Student student);
}
