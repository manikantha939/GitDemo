package MethodOverriding21;

public class Instagram2 extends Instagram1 {
    @Override
    void upload(){
        super.upload();
        System.out.println("Upload Gif");
    }

    void dm(){
        System.out.println("DM Text");
    }
}
