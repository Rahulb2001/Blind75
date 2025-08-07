package org.example.PrototypeandRegistery;


public class Student  implements Clonable <Student>{

    private int rollno;
    private String name;
    private String Dateofbirth;


    public Student(Student student) {
        this.rollno = student.rollno;
        this.name = student.name;
        Dateofbirth = student.Dateofbirth;
    }

    public Student() {
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

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        Dateofbirth = dateofbirth;
    }


    @Override
    public Student copy() {
        return new Student(this);
    }
}
