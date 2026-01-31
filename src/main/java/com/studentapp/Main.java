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

        //System.out.println(s1);
        s1.printStudentInfo();

        Student s2 = new Student("Eduardo", 20, "S-11");
        s2.enrollCourse("Java");
        //System.out.println(s2);
        s2.printStudentInfo();

        Student s3 = new Student("Mario", 21, "S-12");
        s3.enrollCourse("DevOps");
        //System.out.println(s3);
        s3.printStudentInfo();
    }

}
