package StaticAndNonStatic;

public class Runner {
    void m1(){
        System.out.println("Hi");
        int result=m2();
        System.out.println("hello "+result);
    }
    static int m2(){
        return 20;
    }
    public static void main(String[] args) {
        System.out.println("execution start");
        Runner r=new Runner();
        r.m1();
        System.out.println("execution ends");

    }
}
