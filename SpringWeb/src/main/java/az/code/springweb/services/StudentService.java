package az.code.springweb.services;

import az.code.springweb.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAll();
    List<Student> find(String name, String surname);
    Student getById(int id);
    Student save(Student student);
}
