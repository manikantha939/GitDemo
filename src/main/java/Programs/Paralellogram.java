package Programs;

import java.util.Scanner;

public class Paralellogram {
    static int B;
    static int H;
    static {
        Scanner sc=new Scanner(System.in);
        System.out.printf("B: ");
        B=sc.nextInt();
        System.out.println("H: ");
        H=sc.nextInt();
        if(B>=0 && H>=0){
            System.out.println("Area: "+B*H);
            System.exit(0);
        }
        sc.close();
    }
    public static void main(String[] args) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
//        if(B>=0 && H>=0){
//            System.out.println(B*H);
//        }else {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }
    }
}
