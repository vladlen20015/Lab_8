package com.company;

public class Teacher extends People {
    Teacher(String name, String lastname, int age){
        super(name, lastname, age);
    }
    public void teach(){
        System.out.println("Teach");
    }
}
