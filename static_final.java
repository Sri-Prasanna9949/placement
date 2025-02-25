import java.util.*;
class A
{
    final class B
    {
        static void display()
        {
            System.out.println("Displayed");
        }
    }
}
class Main
{
    public static void main(String arge[])
    {
        A.B.display();
    }
}