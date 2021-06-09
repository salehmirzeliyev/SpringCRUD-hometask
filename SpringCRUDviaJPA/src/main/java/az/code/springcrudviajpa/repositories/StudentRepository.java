package az.code.springcrudviajpa.repositories;

import az.code.springcrudviajpa.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
