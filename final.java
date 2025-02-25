import java.util.*;
abstract class Abstract
{
    static final int a=get_a();
    public static int get_a()
    {
        return 20;
    }
    static void display()
    {
        System.out.println(" value : "+a);
    }
}
class Main
{
    public static void main(String arge[])
    {
        Abstract.display();
    }
}