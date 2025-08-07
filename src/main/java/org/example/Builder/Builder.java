package org.example.Builder;

public class Builder {

    private int rollno;
    private String name;
    private String subject;
    private String dateOfBirth;
    private String address;

    public Builder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Builder setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        return new Student(rollno, name, subject, dateOfBirth, address);
    }
}
