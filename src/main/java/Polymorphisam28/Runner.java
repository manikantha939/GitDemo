package Polymorphisam28;

public class Runner {
    static void test(Employee e){
        e.work();
    }
    public static void main(String[] args) {
        Tester t=new Tester();
        t.work();
        Developer d=new Developer();
        d.work();
        System.out.println("--------------------");
        Employee emp;
        emp=new Tester();
        emp.work();
        emp=new Developer();
        emp.work();
        System.out.println("---------------------");
        Employee e1=new Tester();
        e1.work();
        Employee e2=new Employee();
        e2.work();
        System.out.println("---------------------");
        new Tester().work();
        new Developer().work();
        System.out.println("---------------------");
        test(new Tester());
        test(new Developer());
    }
}
