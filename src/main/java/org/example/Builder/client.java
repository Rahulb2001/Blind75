package org.example.Builder;

public class client {

    public static void main(String[] args) {

        Student student = new Builder()
                .setRollno(1)
                .setName("John Doe")
                .setSubject("Mathematics")
                .setDateOfBirth("2000-01-01")
                .setAddress("123 Main St")
                .build();

        System.out.println("Student Details:");
        System.out.println("Roll No: " + student.getRollno());
        System.out.println("Name: " + student.getName());
        System.out.println("Subject: " + student.getSubject());
        System.out.println("Date of Birth: " + student.getDateOfBirth());
        System.out.println("Address: " + student.getAddress());


    }
}
