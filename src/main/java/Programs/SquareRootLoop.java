package Programs;

import java.util.Scanner;

public class SquareRootLoop {
    /*
    s^n=0 = a+2^0*b
    s^n=1 = a+2^0*b+2^1*b
    s^n=2 = a+2^0*b+2^1*b+2^2*b
    s^n=3 = a+2^0*b+2^1*b+2^2*b+2^3*b
     */
    static int squareRoot(int base, int exponent) {
        int sq = (int) Math.pow(base, exponent);
        return sq;
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Square root of a number is: ");
            int t = in.nextInt();// to get the square root number
            System.out.println("input a: ");
            int a = in.nextInt();
            System.out.println("input b: ");
            int b = in.nextInt();
            System.out.println("input n: ");
            int n = in.nextInt();
            int sum = a + (squareRoot(t,0)) * b;
            System.out.printf("output:%d ", sum);
            for (int i = 1; i < n; i++) {
                    sum = sum + (squareRoot(t,i)) * b;
                    System.out.printf("%d ", sum);
                }
            System.out.println();
            in.close();
        }
}