package org.example.Singleton;

public class Client {

    public static void main(String[] args) {

        Student student1 = Student.getInstance();
        student1.setRollno(101);
        student1.setName("Alice");
        student1.setSubject("Physics");
        student1.setDateOfBirth("2001-05-15");
        student1.setAddress("456 Elm St");
        System.out.println(student1.toString());


    }
}
