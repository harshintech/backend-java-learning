package com.newlearning;

class Employee {
    int id;
    int salary;
    String name;


    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("MY name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class H38_customclass {
    public static void main(String[] args) {

        System.out.println("This is our Custom Class");

        Employee Harsh = new Employee();//Instantiating a new Empoyee Object
        Employee Person = new Employee();

        //Setting Attributes
        Harsh.id = 8;
        Harsh.name = "CodewithHarsh";

        Person.id = 5;
        Person.name = "Person";
        Person.salary = 58;


        //Printing Attributes
        Harsh.printDetails();
        Person.printDetails();
        int salary = Person.getSalary();
        System.out.println(salary);

        //System.out.println(Harsh.id);
        //System.out.println(Harsh.name);






    }
}
