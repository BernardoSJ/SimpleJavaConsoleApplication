package com.studentapp;

import java.util.*;

public class Main3 {

    private static List<Student> studentList;

    public static void main(String[] args){
        System.out.println("********** Student Management System **********");
        System.out.println("******** Welcome ********");
        studentList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name....");
        String name = scanner.next();
        System.out.println("You have entered the name: " + name);

        System.out.println("Enter Student Age....");
        int age = scanner.nextInt();
        System.out.println("The Student age is: " + age);
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
