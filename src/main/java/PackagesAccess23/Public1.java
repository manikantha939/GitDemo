package PackagesAccess23;

/* Accessing public member inside same class*/

public class Public1 {
    public int variable=10;
    public static int var=2;

    public Public1(){
        System.out.println("Constructor is public");
    }

    public void method(){
        System.out.println("method is public");
    }

    public static void main(String[] args) {
        Public1 p1=new Public1();
        System.out.println(p1.variable);
        System.out.println(var);
        p1.method();

    }
}



