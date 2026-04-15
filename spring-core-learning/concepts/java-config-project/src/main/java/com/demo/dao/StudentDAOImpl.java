package com.demo.dao;
import com.demo.beans.Student;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public void save(Student student) {
        System.out.println("[DAO] Saving student to DB: " + student);
    }
    @Override
    public Student findById(int id) {
        System.out.println("[DAO] Fetching student with id: " + id);
        return new Student(id, "Harsh", "DevSecOps");
    }
}
