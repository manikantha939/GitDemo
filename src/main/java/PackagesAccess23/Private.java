package PackagesAccess23;

import javax.crypto.spec.PSource;

public class Private {
    private int a=10;

    public void setA(int a) {
        this.a = a;
    }
    public int getA(){
        return a;
    }

    private Private(){
        System.out.println("Private constructor");
    }

    private void text(){
        System.out.println("Private method");
    }



    public static void main(String[] args) {
        Private p1=new Private();
        p1.setA(20);
        System.out.println(p1.a);
    }
}