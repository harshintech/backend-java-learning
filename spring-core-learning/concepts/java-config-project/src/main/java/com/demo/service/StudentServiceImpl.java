package com.demo.service;
import com.demo.beans.Student;
import com.demo.dao.StudentDAO;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    // Setter Injection - Spring calls this automatically from XML config
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void enrollStudent(Student student) {
        System.out.println("[Service] Enrolling student: " + student.getName());
        studentDAO.save(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.findById(id);
    }
}
