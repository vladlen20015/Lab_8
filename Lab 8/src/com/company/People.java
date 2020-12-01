package com.company;

public class People {
    protected String name;
    protected String lastname;
    protected int age;

   public People(  String name, String lastname, int age){
      this.name = name;
      this.lastname = lastname;
      this.age = age;
   }

   public void printInfo(){

        System.out.println(this.name+ " " + this.lastname + " " + this.age);
   }
   public void walk(){
        System.out.println("walk");
   }
   public void voice(){
        System.out.println("voice");
   }
   public void run(){
        System.out.println("run");
   }

    }

