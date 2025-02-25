mport java.util.*;
interface A
{
    int a=10;
    static void display1()
    {
        //a=20;
        System.out.println(a);
        System.out.println("static method");
    }
    default void display2()
    {
        System.out.println("default method");
    }
}
public class Main implements A
{
    public static vo