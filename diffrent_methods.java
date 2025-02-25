import java.util.Scanner;
class Calculator
{
    Scanner in = new Scanner(System.in);
    public void add()
    {
        System.out.println("Enter a :");
        int a=in.nextInt();
        System.out.println("Enter b :");
        int b=in.nextInt();
        int c=a+b;
        System.out.println("The addition value is : "+c);
    }
    public int diff()
    {
        System.out.println("Enter a :");
        int a=in.nextInt();
        System.out.println("Enter b :");
        int b=in.nextInt();
        int c=a-b;
        return c;
    }
    public void product(int a,int b)
    {
        int c=a*b;
        System.out.println("The product value is : "+c);
    }
    public int division(int a,int b)
    {
        int c=a/b;
        return c;
    }
}
class Main{
   
	public static void main(String[] args) {
	    Calculator obj=new Calculator();
	    obj.add();
	    int a=obj.diff();
	    System.out.println("The Subraction value is : "+a);
	    obj.product(10,20);
	    int b=obj.division(10,5);
	    System.out.println("The division value is : "+b);
	    
	}
}

