package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    private static List<Student> studentList;

    public static void main(String[] args){
        System.out.println("********** Student Management System **********");
        System.out.println("******** Welcome ********");
        studentList = new ArrayList<>();
        Student s1 = new Student("Bernardo", 27, "S-1");
        s1.enrollCourse("Java");
        s1.enrollCourse("DevOps");
        s1.enrollCourse("DSA");
        s1.enrollCourse("C#");

        Student s2 = new Student("Eduardo", 20, "S-11");
        s2.enrollCourse("Java");

        Student s3 = new Student("Mario", 21, "S-12");
        s3.enrollCourse("DevOps");

        Student s4 = new Student("Elena", 30, "S-14");
        s4.enrollCourse("DevOps");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Student result = findStudentById("S-11");
        System.out.println("Result " + result);
        sortByName();
    }


    public static Student findStudentById(String studentId) {
       Student result = null;
       try{
           result= studentList.stream()
                   .filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
                   .findFirst()
                   .orElseThrow(() -> new RuntimeException("No Data Found"));
       }catch (RuntimeException e){
           System.err.println("Student with ID "+studentId+ " not found!!");
       }

       return result;
    }

    private static void sortByName(){
        Comparator<Student> studentNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(studentList, studentNameComparator);
        System.out.println(studentList);
    }

}
