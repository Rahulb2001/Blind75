package org.example.PrototypeandRegistery;

import java.util.HashMap;

public class StudentRegistry {


    HashMap<String,Student> studentRegistry = new HashMap<>();


    public void registerStudent(String id, Student student) {
        studentRegistry.put(id, student);
    }


    public Student get(String name){
        Student student=studentRegistry.get(name);
        return student;
    }

    public void remove(String name) {
        studentRegistry.remove(name);
    }

    public void clear() {
        studentRegistry.clear();
    }

    public boolean isEmpty() {
        return studentRegistry.isEmpty();
    }

    public int size() {
        return studentRegistry.size();
    }




}
