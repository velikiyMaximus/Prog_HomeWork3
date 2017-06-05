package com.gmail.velikiymaximus;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Максим on 05.06.2017.
 */
public class Group {

    private int number;
    private Student[] group = new Student[10];

    public Group() {
        super();
    }

    public Group(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addStudent(Student student) throws OverflowArrayException{

        boolean f = false;
        for (int i = 0; i < group.length; i++){
            if(group[i] == null){
                f = true;
            }
        }

        if (f == false) throw new OverflowArrayException("There can not be more than 10 people in a group.");

        for (int i = 0; i < group.length; i++){
            if(group[i] == null){
                group[i] = student;
                break;
            }
        }

    }

    public void deleteStudent(String name){

        for (int i = 0; i < group.length; i++){
            if(group[i].getName() == name){
                group[i] = null;
                break;
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < group.length; i++){
            builder.append(i + 1 + ") " + group[i] + "\n");
        }
        return "Number group = " + number + "\n" + builder;
    }
}



































