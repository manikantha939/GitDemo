package Constructors;

public class Variable{
    double height=5.5;//member variable

    void display(){
        double height=4.4;//local variable
        System.out.println(this.height);
    }

    public static void main(String[] args) {
        Variable v=new Variable();
        v.display();
    }
}
