package org.example.PrototypeandRegistery;

public class Client {

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();

        Student student = new Student();
        student.setRollno(12);
        student.setName("John Doe");
        student.setDateofbirth("January 1, 2000");
        studentRegistry.registerStudent("1", student);

        Student clonedStudent = student.copy();
        clonedStudent.setRollno(13);
        clonedStudent.setName("Rahul");
        clonedStudent.setDateofbirth("February 2, 2001");

        studentRegistry.registerStudent("2", clonedStudent);

        System.out.println("Student 1: " + studentRegistry.get("1").getName());
        System.out.println("Student 2: " + studentRegistry.get("2").getName());
        System.out.println("Total students in registry: " + studentRegistry.size());
        System.out.println("Is registry empty? " + studentRegistry.isEmpty());
        studentRegistry.remove("1");
        System.out.println("After removing student 1, total students in registry: " + studentRegistry.size());
        studentRegistry.clear();
        System.out.println("After clearing, is registry empty? " + studentRegistry.isEmpty());
        System.out.println("Total students in registry after clearing: " + studentRegistry.size());


    }
}
