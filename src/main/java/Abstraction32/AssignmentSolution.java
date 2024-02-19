package Abstraction32;

import java.util.Scanner;

public class AssignmentSolution extends AssignmentCalcImpl {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculation");
        System.out.println("-----------------------------");
        Scanner scan=new Scanner(System.in);
        AssignmentCalculator ac=new AssignmentSolution();
        while(true){
            String input1="Enter first number";
            String input2="Enter second number";
            System.out.println("1. Addition\n2. Subtraction\n3. Multiply\n4. Division\n5. Exit");
            System.out.println("choose the Operation");
            int choice=scan.nextInt();
            double a;
            double b;
            switch (choice){
                case 1:
                    System.out.println(input1);
                    a=scan.nextDouble();
                    System.out.println(input2);
                    b=scan.nextDouble();
                    double sum=ac.sum(a,b);
                    System.out.println("Sum of "+a+" and "+b+" is "+sum);
                    break;
                case 2:
                    System.out.println(input1);
                    a=scan.nextDouble();
                    System.out.println(input2);
                    b=scan.nextDouble();
                    System.out.println(input1);
                    System.out.println("Subtraction of "+a+" and "+b+" is "+ac.sub(a,b));
                    break;
                case 3:
                    System.out.println(input1);
                    a=scan.nextDouble();
                    System.out.println(input2);
                    b=scan.nextDouble();
                    System.out.println(input1);
                    double mul=ac.mul(a,b);
                    System.out.println("Multiply of "+a+" and "+b+" is "+mul);
                    break;
                case 4:
                    System.out.println(input1);
                    a=scan.nextDouble();
                    System.out.println(input2);
                    b=scan.nextDouble();
                    System.out.println(input1);
                    double div=ac.div(a,b);
                    System.out.println("Division of "+a+" and "+b+" is "+div);
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Enter valid input");

            }
            System.out.println("---------------------------------");
        }
    }

}
