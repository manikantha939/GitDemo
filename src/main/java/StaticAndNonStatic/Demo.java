package StaticAndNonStatic;

public class Demo {
    static int x=10;
    int y=20;
    void m1(){
        System.out.println("Hi");
    }
    static void m2(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println(x);
        m2();
        Demo d=new Demo();
        System.out.println(d.y);
        d.m1();
    }
}
