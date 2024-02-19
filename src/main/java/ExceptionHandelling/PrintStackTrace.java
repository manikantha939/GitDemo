package ExceptionHandelling;

public class PrintStackTrace {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            System.out.println(10/0);
        }catch (Exception e){
            //to get the complete error message
            e.printStackTrace();
        }

        System.out.println("End");
    }
}
