package com.demo;

import com.demo.beans.Student;
import com.demo.config.AppConfig;
import com.demo.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // Load Java-based config (no XML needed!)
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("=== Spring Java Config Demo ===\n");

        Student s1 = context.getBean("student1", Student.class);
        System.out.println("Constructor Injected: " + s1);

        Student s2 = context.getBean("student2", Student.class);
        System.out.println("Setter Injected:      " + s2);

        StudentService service = context.getBean(StudentService.class);
        service.enrollStudent(s1);
        Student fetched = service.getStudent(101);
        System.out.println("Fetched: " + fetched);

        Student singleton1 = context.getBean("singletonBean", Student.class);
        Student singleton2 = context.getBean("singletonBean", Student.class);
        System.out.println("\nSingleton same instance? " + (singleton1 == singleton2));

        Student proto1 = context.getBean("prototypeBean", Student.class);
        Student proto2 = context.getBean("prototypeBean", Student.class);
        System.out.println("Prototype same instance? " + (proto1 == proto2));

        ((AnnotationConfigApplicationContext) context).close();
    }
}
