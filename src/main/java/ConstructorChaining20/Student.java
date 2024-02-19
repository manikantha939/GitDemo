package ConstructorChaining20;

public class Student {
    Student(int age) {
        this("tom");
        System.out.println("Student age: "+age);
    }
    Student(double height) {
        this(10);
        System.out.println("Student height: "+height);
    }
    Student(String name) {
        System.out.println("Student name: "+name);
    }

    public static void main(String[] args) {
        Student s=new Student(5.5);
    }
}
