package Programs;

import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;
            while(sc.hasNext()){
                String input=sc.nextLine();
                if(input.equalsIgnoreCase("Exit"))break;
                System.out.println(count++ +" "+input);
            }
            sc.close();
    }
}
