package ExceptionHandelling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
