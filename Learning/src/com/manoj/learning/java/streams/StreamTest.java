package com.manoj.learning.java.streams;

import java.util.*;
import java.util.stream.Collectors;

/*
Get student with exact match name "jayesh"
Get student with matching address "1235"
        Get all student having mobile numbers 3333.
        Get all student having mobile number 1233 and 1234
        Create a List<Student> from the List<TempStudent>
Convert List<Student> to List<String> of student name
        Convert List<students> to String
        Change the case of List<String>
Sort List<String>
Conditionally apply Filter condition, say if flag is enabled then.
 */

public class StreamTest {

    public static List<Student> getListOfStudents(){
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);


        return students;
    }

    public static void main(String[] args) {
        List<Student> students=getListOfStudents();
//    *******************************************************
//    1.    Get student with exact match name "jayesh"
//    *******************************************************
        Optional<Student> stu =  students.stream()
                                        .filter(student -> student.getName().equals("Jayesh"))
                                        .findFirst();
        System.out.println(stu.get().toString());
/*******************************************************
   2.    Get student with matching address "1235"
*******************************************************/
        stu = students.stream()
                .filter(student -> student.getAddress().getZipcode().equals("12351"))
                .findFirst();
        System.out.println(stu.isPresent()?stu.get().toString():"No student found residing in that address");

/*******************************************************
 3.       Get all student having mobile numbers 3333.
 *******************************************************/
         students.stream()
                .filter(student -> student.getMobileNumbers()
                        .stream().anyMatch(mobileNumber -> mobileNumber.getNumber().equals("3333")))
//                .map(x -> x.getName()).forEach(x -> System.out.println("Student name :::"+x));
                 .forEach(x -> System.out.println("Student name :::"+x.getName()));
//        System.out.println("count =="+temp);

/************************************************************
    Get all student having mobile number 1233 and 1234
 ************************************************************/
        students.stream().filter(student -> student.getMobileNumbers()
                .stream()
                .anyMatch(mobileNumber ->
                        Objects.equals(mobileNumber.getNumber(),"1233")||
                                Objects.equals(mobileNumber.getNumber(),"1234")))
                .forEach(student -> System.out.println("Student with mob numbers 1233 or 1234 ::"+student.getName()));

        /*****************************************************
         Create a List<Student> from the List<TempStudent>
         *****************************************************/

        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

        List<TempStudent> tempStudents = Arrays.asList(tmpStud1,tmpStud2);

        List<Student> myStudents = tempStudents.stream()
                        .map(temp -> new Student(temp.name,temp.age, temp.address, temp.mobileNumbers))
                        .collect(Collectors.toList());

        System.out.println("********************************************************");
        myStudents.stream().forEach(student -> System.out.println(student.toString()));
//        System.out.println(myStudents.get(1).toString());
        System.out.println("--------------------");

        /*****************************************************
         Convert List<Student> to List<String> of student name
         *****************************************************/
        List <String> stuName =
                        students.stream()
                          .map(student -> student.getName())
                            .collect(Collectors.toList());
        System.out.println(stuName);
        System.out.println("--------------------");

        /*****************************************************
         Convert List<students> to String
         *****************************************************/
        String result = students.stream()
                            .map(student -> student.getName())
                             .collect(Collectors.joining(",","[","]"));
        System.out.println("Result is " + result);
        System.out.println("--------------------");

        /*****************************************************
         Change the case of List<String>
         *****************************************************/
        stuName.add("Manoj");
        stuName.add("Kumar");
        stuName.add("Ab");
        System.out.println(stuName);
//              stuName=
                      stuName.stream()
                            .map(s -> s.toUpperCase())
                            .forEach(System.out::println);
//                            .collect(Collectors.toList());

        System.out.println(stuName);
        System.out.println("--------------------sorting");

        /*****************************************************
         Sort List<String>
         *****************************************************/
                stuName.stream().sorted((i1, i2) -> i1.compareTo(i2))
                        .forEach(System.out::println);
/*****************************************************
 Conditionally apply Filter condition, say if flag is enabled then
 *****************************************************/

    }

}
