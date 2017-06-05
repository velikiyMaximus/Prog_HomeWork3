package com.gmail.velikiymaximus;

/**
 * Created by Максим on 05.06.2017.
 */
public class Human {

    private String name;
    private int age;
    private boolean sex;
    private int weight;
    private int height;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, boolean sex, int weight, int height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", age=" + age +
                ", sex=" + sex +
                ", weight=" + weight +
                ", height=" + height;
    }
}











































