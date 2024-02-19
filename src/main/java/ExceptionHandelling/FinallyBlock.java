package ExceptionHandelling;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(10/0);
        }catch (NullPointerException e){
            System.out.println("Invalid Denominator");
        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("End ");
    }
}
