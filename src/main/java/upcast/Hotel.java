package upcast;

public class Hotel {
    public static void main(String[] args) {
        Food f=new Vada(); // upcasting

        if(f instanceof  Idli){
            Idli i=(Idli) f;//down casting
            System.out.println("value is: "+i.a);
            System.out.println("value is: "+ i.b);
        }
        else if(f instanceof Vada){
            Vada v=(Vada)f;// down casting
            System.out.println("value is: "+v.a);
            System.out.println("value is: "+v.c);
        }



    }
}
