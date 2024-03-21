package com.es2.memento;
import java.util.ArrayList;
public class Memento {
    private final ArrayList<String> studentNames= new ArrayList<>();

    public Memento(ArrayList<String> studentNames) {
        this.studentNames.addAll(studentNames);
    }

    public ArrayList<String> getState() {
        return studentNames;
    }

}
