import java.util.Scanner;
public class Main {
    static class Calculate
    {
        public static void area(int x)
        {
            int a=x*x;
            System.out.println("The area of Square is : "+a);
            
        }
        public static void area(int x,int y)
        {
            int b=x*y;
            System.out.println("The area of Rectangle is : "+b);
        }
        public static void area(float x)
        {
            float c=3.14f*x*x;
            System.out.println("The area of Rectangle is : "+c);
        }
    }
    public static void main(String[] args) {
        Calculate.area(12);
        Calculate.area(12,2);
        Calculate.area(3f);
    }
}
