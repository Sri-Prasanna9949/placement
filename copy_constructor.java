import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Rectangle a = new Rectangle(10,5);
      a.display();
      Rectangle b = new Rectangle(a);
      b.display();
    }
}

class Rectangle
{
    float length;
    float width;
    Rectangle(float length,float width)
    {
        this.length=length;
        this.width=width;
    }
    Rectangle(Rectangle r)
    {
        this.length=r.length;
        this.width=r.width;
    }
    void display()
    {
        System.out.print("The Length is : "+length);
        System.out.println("The Width is : "+width);
    }
    
}

