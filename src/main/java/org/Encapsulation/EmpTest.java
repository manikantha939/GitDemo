package org.Encapsulation;

import java.util.Scanner;

public class EmpTest {
    public static void main(String[] args) {
        Emp e=new Emp();
        //to take dynamic input
        Scanner s=new Scanner(System.in);
        System.out.println("enter a id");
        int id=s.nextInt();
        e.setId(id);

        System.out.println("enter a name");
        String name=s.next();
        e.setName(name);

        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
