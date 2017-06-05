package com.gmail.velikiymaximus;

/**
 * Created by Максим on 05.06.2017.
 */
public class Student extends Human {

    private String faculty;
    private int course;

    public Student() {
        super();
    }

    public Student(String name, String faculty, int course) {
        super(name);
        this.faculty = faculty;
        this.course = course;
    }

    public Student(String name, int age, boolean sex, int weight, int height, String faculty, int course) {
        super(name, age, sex, weight, height);
        this.faculty = faculty;
        this.course = course;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "name = " + getName() +
                ", faculty = " + faculty +
                ", course = " + course;
    }
}










































