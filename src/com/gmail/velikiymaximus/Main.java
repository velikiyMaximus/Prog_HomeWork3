package com.gmail.velikiymaximus;

/**
 * Created by Максим on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Максим", "ПЦБ", 3);
        Student student2 = new Student("Вася", "ПЦБ", 3);
        Student student3 = new Student("Лена", "ПЦБ", 3);
        Student student4 = new Student("Данил", "ПЦБ", 3);
        Student student5 = new Student("Лиля", "ПЦБ", 3);
        Student student6 = new Student("Света", "ПЦБ", 3);
        Student student7 = new Student("Толик", "ПЦБ", 3);
        Student student8 = new Student("Влад", "ПЦБ", 3);
        Student student9 = new Student("Андрей", "ПЦБ", 3);
        Student student10 = new Student("Алена", "ПЦБ", 3);
        Group group = new Group(31);
        try {
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
            group.addStudent(student7);
            group.addStudent(student8);
            group.addStudent(student9);
            group.addStudent(student10);
            System.out.println(group);

            group.deleteStudent("Данил");
            System.out.println(group);
            Student student11 = new Student("Гоша", "ПЦБ", 3);
            group.addStudent(student11);
            System.out.println(group);

//            Student student12 = new Student("Петя", "ПЦБ", 3);
//            group.addStudent(student12);
//            System.out.println(group);
        }
        catch (OverflowArrayException e){
            System.out.println(e.getMessage());
        }
    }
}
