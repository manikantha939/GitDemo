package StaticAndNonStatic;

public class CarSatic {
    static int age;
    static {
        System.out.println("initializing age to 10");
        age=10;//CarStatic.age
    }

    public static void main(String[] args) {
        System.out.println(age);//CarStatic.age
    }
    static {
        System.out.println("initializing age to 20");
        age=20;//CarStatic.age
    }
}
