package Polymorphisam28;

public class ComplieTimePolymorphisam {
    static void work(){
        System.out.println("work 1");
    }
    void work(String name){
        System.out.println(name+" work 2");
    }
    void work(double salary, String name){
        System.out.println(salary+" work 3 "+name);
    }

    public static void main(String[] args) {
        ComplieTimePolymorphisam ctp=new ComplieTimePolymorphisam();
        ComplieTimePolymorphisam.work();
        ctp.work("shop keeper");
        ctp.work(20.00, "Chef");
    }
}
