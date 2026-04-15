package com.newlearning;

class MyMainEmployee {
    private int id;
    private String name;

    //constructors - 1
    public MyMainEmployee(){
        id = 66;
        name = "Your-Name";
    }
    //constructors - 2
    public MyMainEmployee(int myId,String myName){
        id = myId;
        name = myName;
    }

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

public class H42_constructors {

    public static void main(String[] args) {

        MyMainEmployee harsh = new MyMainEmployee(6,"ProgrammingWithHarshh");
//        harsh.setId(8);
//        harsh.setName("Harsh");
        System.out.println(harsh.getId());
        System.out.println(harsh.getName());



    }
}
