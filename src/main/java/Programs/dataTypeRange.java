package Programs;

import java.util.Scanner;

public class dataTypeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in: ");
                if(x>=-(long) Math.pow(2, 7) && x<=(long) Math.pow(2, 7))System.out.println("* byte");
                if (x >= -(long) Math.pow(2, 15) && x < (long) Math.pow(2, 15)) System.out.println("* short");
                if (x >= -(long) Math.pow(2, 31) && x < (long) Math.pow(2, 31)) System.out.println("* int");
                if (x >= -(long) Math.pow(2, 63) && x < (long) Math.pow(2, 63)) System.out.println("* long");
//                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)  System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next()+" Can't be fitted in");
            }
        }
    }
}
