package az.code.springweb.services;

import az.code.springweb.dao.StudentDAO;
import az.code.springweb.dao.StudentDAOMemoryImpl;
import az.code.springweb.models.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDAOMemoryImpl studentDAOMemory;

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
