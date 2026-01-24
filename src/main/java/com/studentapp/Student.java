package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId) {
        if(validateAge(age) && validateName(name)){
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            courses = new ArrayList<String>();
        }
    }

    public void enrollCourse(String course){
        courses.add(course);
        System.out.println("Student is enrolled to " + course + " successfully");
    }

    public void printStudentInfo() {
        System.out.println("========== Student Information ==========");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Id: " + studentId);
        System.out.println("Enrolled For: " + courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    //Validation Methods

    public boolean validateAge(int age){
        if(age >= 19 && age<=35){
            return true;
        }
        System.err.println("Invalid age!!! Student Age needs to be between 19 and 35");
        return false;
    }

    public boolean validateName(String name){
        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);
        if(nameMatcher.matches()){
            return true;
        }
        System.err.println("Invalid Name!!! Please enter alphabets only");
        return false;
    }

}
