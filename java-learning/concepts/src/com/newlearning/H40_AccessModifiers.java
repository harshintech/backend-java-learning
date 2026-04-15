package com.newlearning;

//Access Modifiers and Getter & Setter

class MyEmployee {
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

public class H40_AccessModifiers {
    public static void main(String[] args) {


        MyEmployee harsh = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harsh.setId(8);
        System.out.println(harsh.getId());
        harsh.setName("CodewithHarsh");
        System.out.println(harsh.getName());

        //this is show path of class(from object)
        System.out.println(harsh.getClass());

    }
}
