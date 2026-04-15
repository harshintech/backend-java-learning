package com.todo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;
import com.service.StudentService;
import com.entity.Student;

import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = context.getBean(StudentService.class);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student CRUD Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    service.saveStudent(new Student(name, email));
                    System.out.println("Student saved successfully!");
                }
                case 2 -> {
                    System.out.println("Students List:");
                    service.getAllStudents().forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Enter Student ID to Update: ");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    Optional<Student> student = service.getStudentById(id);
                    if (student.isPresent()) {
                        System.out.print("Enter new Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter new Email: ");
                        String email = sc.nextLine();
                        Student s = student.get();
                        s.setName(name);
                        s.setEmail(email);
                        service.updateStudent(s);
                        System.out.println("Updated Successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }

                }
                case 4 -> {
                    System.out.print("Enter Student ID to Delete: ");
                    Long id = sc.nextLong();
                    service.deleteStudent(id);
                    System.out.println("Deleted Successfully!");
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    context.close();
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
