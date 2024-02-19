package Programs;

import java.util.Scanner;

public class javaOutputFormatting {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("===============================================");
            for (int i=0;i<3;i++) {
            System.out.println("Enter input for X: ");
            String x = sc.next();
            System.out.println("Enter input for Y: ");
            int y = sc.nextInt();
            System.out.printf("%-15s%3d\n", x, y);
            System.out.println("===============================================");
        }
    }
}

