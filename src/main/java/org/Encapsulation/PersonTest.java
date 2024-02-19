package org.Encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(10);
        int age=p.getAge();
        System.out.println("age: "+age);
        System.out.println(p.getAge());
    }
}
