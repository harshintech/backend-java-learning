package com.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.dao.StudentDAO;
import com.entity.Student;

@Service
public class StudentService {
    private final StudentDAO dao = new StudentDAO();

    public void saveStudent(Student s) { dao.save(s); }
    public List<Student> getAllStudents() { return dao.findAll(); }
    public Optional<Student> getStudentById(Long id) { return dao.findById(id); }
    public void updateStudent(Student s) { dao.update(s); }
    public void deleteStudent(Long id) { dao.delete(id); }
}
