package ExceptionHandelling;

public class ThrowsException {

    static void demo() throws ArithmeticException
    {
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            demo();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
