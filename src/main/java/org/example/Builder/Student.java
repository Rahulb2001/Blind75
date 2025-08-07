package org.example.Builder;

public class Student {

    private int rollno;
    private String name;
    private String subject;
    private String dateOfBirth;
    private String address;

    public Student(int rollno, String name, String subject, String dateOfBirth, String address) {
        this.rollno = rollno;
        this.name = name;
        this.subject = subject;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Student(Student student) {
        this.rollno = student.rollno;
        this.name = student.name;
        this.subject = student.subject;
        this.dateOfBirth = student.dateOfBirth;
        this.address = student.address;
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

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
