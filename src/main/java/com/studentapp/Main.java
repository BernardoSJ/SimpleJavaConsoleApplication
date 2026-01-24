package com.studentapp;

public class Main {

    public static void main(String[] args){
        System.out.println("********** Student Management System **********");
        System.out.println("******** Welcome ********");

        Student s1 = new Student("Bernardo", 27, "S1");
        s1.printStudentInfo();
    }

}
