package Programs;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Integer input: ");
        int input=sc.nextInt();
        String s= String.valueOf(input);//to convert int to String
        System.out.println("Converting Int to String: "+s);

        System.out.println("------------------------------------------------");

        System.out.println("Enter String input: ");
        String input1=sc.next();
        int s1=Integer.parseInt(input1);//to convert String to int
        System.out.println("Converting String to Int: "+s1);

        System.out.println("------------------------------------------------");

        System.out.println("Enter String input: ");
        String input2=sc.next();
        int s2=Integer.parseInt(input2);//to convert String to int
        System.out.println("Converting String to Int" + s2);
        sc.close();

        System.out.println("------------------------------------------------");

        System.out.println("Enter Integer input: ");
        int input3=sc.nextInt();
        String s3= String.valueOf(input3);//to convert int to String
        System.out.println("Converting Int to String: "+s3);
    }
}
