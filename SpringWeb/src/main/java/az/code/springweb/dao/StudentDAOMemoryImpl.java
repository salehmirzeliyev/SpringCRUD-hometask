package az.code.springweb.dao;

import az.code.springweb.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentDAOMemoryImpl implements StudentDAO{

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public List<Student> find(String name, String surname) {
        return null;
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }
}
