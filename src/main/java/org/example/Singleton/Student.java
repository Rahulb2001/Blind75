package org.example.Singleton;

public class Student {
    private int rollno;
    private String name;
    private String subject;
    private String dateOfBirth;
    private String address;

    private static volatile Student instance;

    private Student() {}

    public static Student getInstance() {
        if (instance == null) {
            synchronized (Student.class) {
                if (instance == null) {
                    instance = new Student();
                }
            }
        }
        return instance;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void setInstance(Student instance) {
        Student.instance = instance;
    }

    // Your getters, setters, and other methods...
}