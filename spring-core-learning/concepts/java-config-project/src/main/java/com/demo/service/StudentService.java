package com.demo.service;
import com.demo.beans.Student;
public interface StudentService {
    void enrollStudent(Student student);
    Student getStudent(int id);
}
