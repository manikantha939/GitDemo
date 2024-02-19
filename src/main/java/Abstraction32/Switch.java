package Abstraction32;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the choice: ");
        int choice=scan.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Hai Dinga!");
                break;
            case 2:
                System.out.println("Bye Dinga!");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}
