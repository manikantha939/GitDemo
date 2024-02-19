package Interface30;

public interface Employee1  {
    String name="tom";
    void develop();

    default void d(){
        System.out.println("test");
    }
}
