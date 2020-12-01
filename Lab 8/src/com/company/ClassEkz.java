package com.company;

public class ClassEkz {
    public static void main(String[] args){
        int a=5;
        People people1= new People("ugk","kjh",18);
        people1.printInfo();
        People people2= new People("lalala","Rororo",20);
        people2.printInfo();
        people2.walk();
        people2.voice();
        people2.run();
        Student student= new Student("Pororo","Totoro",19);
        student.printInfo();
        student.learn();
        Teacher teacher=new Teacher("Dididi","Hahaha",30);
        teacher.printInfo();
        teacher.teach();
    }
}
