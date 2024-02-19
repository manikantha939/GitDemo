package ExceptionHandelling;

import java.util.Scanner;

public class ArithmeticException1 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=s.nextInt();
        System.out.println("Enter the value of b: ");
        int b=s.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Do not divide by 0");
        }
        s.close();
        System.out.println("End");
    }
}
