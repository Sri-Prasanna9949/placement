import java.util.Scanner;
class Shape
{
    protected float area;
    public void calculateArea()
    {
        System.out.println("Area : ");
    }
}
    class Square extends Shape{
        
        public void calculateArea()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a : ");
            int a=in.nextInt();
            area=a*a;
            System.out.println("Area : "+area);
        }
    }
    class Circle extends Shape{
        
        public void calculateArea()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter r : ");
            float r=in.nextFloat();
            area=3.14f*r*r;
            System.out.println("Area : "+area);
        }
    }

public class Main{
    
        public static void main(String[] args) {
            
		Shape s1=new Square();
		s1.calculateArea();
		Shape s2=new Circle();
		s2.calculateArea();
	}
}
	
