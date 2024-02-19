package Arrays22;

public class Array {
    public static void main(String[] args) {
        //array declaration
        int [] a;
        //array creation
        a= new int[5];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
//        for (int a1:a
//             ) {
//            System.out.println(a1);
//        }
        System.out.println("---------------------------");
        //array initialization
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("---------------------------");

        //Array declaration and creation
        double[] a12=new double[3];
        System.out.println(a12[0]);
        System.out.println(a12[1]);
        System.out.println(a12[2]);
        System.out.println("---------------------------");
        //array initialization
        a12[0]=1;
        a12[1]=2;
        a12[2]=3;
        System.out.println(a12[0]);
        System.out.println(a12[1]);
        System.out.println(a12[2]);
        System.out.println("---------------------------");

        for (int i=0;i<a12.length;i++) {
            a12[i]=i;
            System.out.println(a12[i]);
        }
//        for (double i:a12)
//        {
//            System.out.println(i);
//        }
    }
}

