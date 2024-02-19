package Abstraction32;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
        System.out.println("Enter the choice: ");
        int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hai Dinga!");
                    break;
                case 2:
                    System.out.println("Bye Dinga!");
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
            System.out.println("-----------------");
        }
    }
}
