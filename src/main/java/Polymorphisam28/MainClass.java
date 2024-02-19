package Polymorphisam28;

public class MainClass {
    void invoke(Employee emp){
        emp.work();
    }

    public static void main(String[] args) {
        MainClass m1=new MainClass();
        m1.invoke(new Tester());
        m1.invoke(new Developer());
        System.out.println("-----------------------");
        Tester t=new Tester();
        m1.invoke(t);
        Developer d=new Developer();
        m1.invoke(d);

    }
}
