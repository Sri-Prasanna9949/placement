import java.util.Scanner;
class Add
{
   public int a,b,c;
   public void display()
   {
       System.out.println("sum = "+c);
   }
   
}
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    Add obj = new Add();
	    System.out.println("Enter the value of a : ");
	    obj.a= in.nextInt();
	    System.out.println("Enter the value of b : ");
	    obj.b= in.nextInt();
	    obj.c=obj.a+obj.b;
	    obj.display();
	}
}

