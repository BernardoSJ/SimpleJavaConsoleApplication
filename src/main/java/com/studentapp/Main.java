package com.studentapp;

public class Main {

    public static void main(String[] args){
        System.out.println("********** Student Management System **********");
        System.out.println("******** Welcome ********");

        Student s1 = new Student("Bernardo", 27, "S-1");
        s1.enrollCourse("Java");
        s1.enrollCourse("DevOps");
        s1.enrollCourse("DSA");
        s1.enrollCourse("C#");
        System.out.println(s1);
    }

}
