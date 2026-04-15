package com.demo.config;

import com.demo.beans.Student;
import com.demo.dao.StudentDAO;
import com.demo.dao.StudentDAOImpl;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// @Configuration = this class replaces applicationContext.xml
// @Bean = this method replaces <bean> tag in XML
@Configuration
public class AppConfig {

    // 1. DAO Bean (equivalent: <bean id="studentDAO" class="...StudentDAOImpl"/>)
    @Bean
    public StudentDAO studentDAO() {
        return new StudentDAOImpl();
    }

    // 2. Service Bean with Setter Injection
    // (equivalent: <bean id="studentService"> <property name="studentDAO" ref="studentDAO"/> </bean>)
    @Bean
    public StudentService studentService() {
        StudentServiceImpl service = new StudentServiceImpl();
        service.setStudentDAO(studentDAO()); // Spring handles this injection
        return service;
    }

    // 3. Student with Constructor Injection
    @Bean(name = "student1")
    public Student student1() {
        return new Student(101, "Harsh", "DevSecOps");
    }

    // 4. Student with Setter Injection
    @Bean(name = "student2")
    public Student student2() {
        Student s = new Student();
        s.setId(102);
        s.setName("Rahul");
        s.setCourse("Full Stack");
        return s;
    }

    // 5. Singleton scope (default in Spring)
    @Bean(name = "singletonBean")
    @Scope("singleton")
    public Student singletonBean() {
        Student s = new Student();
        s.setId(200);
        s.setName("Singleton Student");
        s.setCourse("Java");
        return s;
    }

    // 6. Prototype scope
    @Bean(name = "prototypeBean")
    @Scope("prototype")
    public Student prototypeBean() {
        Student s = new Student();
        s.setId(300);
        s.setName("Prototype Student");
        s.setCourse("Spring");
        return s;
    }
}
