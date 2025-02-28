import java.util.*;
class Strongnumber
{
    public void range(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {
            calculate(i);
        }
    }
    public void calculate(int n)
    {
        int r=0;
        int sum=0;
        //int fact=1;
        //Scanner in= new Scanner(System.in);
        //System.out.println("enter the value of N :");
        //int n=in.nextInt();
        int n1=n;
        while(n1>0)
        {
            r=n1%10;
            sum=sum+factorial(r);;
            n1=n1/10;
            
        }
        //System.out.println(sum);
        if(sum==n)
        {
            System.out.println(n+" the number is Strong number ");
        }
    }
    public int factorial(int x)
    {
        int fact=1;
        for(int i=1;i<=x;i++)
            {
                fact=fact*i;
            }
            return fact;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    /*Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println();*/
	    Strongnumber o= new Strongnumber();
	    o.range(1,1000);
	}
}