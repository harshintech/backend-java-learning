package com.demo.dao;
import com.demo.beans.Student;
public interface StudentDAO {
    void save(Student student);
    Student findById(int id);
}
