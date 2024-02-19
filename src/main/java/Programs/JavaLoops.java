package Programs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the input: ");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine().trim());
        if(2<=N && N<=20){
            for (int i=1;i<=10;i++){
             int res=N*i;
                System.out.println(N+" x "+i+" = "+res);
            }
        }
        bufferedReader.close();

    }
}
