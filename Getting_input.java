import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int a[]=new int [5];
        char b[]=new char [6];
        float c[]=new float [5];
        double d[]= new double [6];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements of the array :");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("enter the elements of the array :");
        for(int i=0;i<b.length;i++)
        {
            b[i]=in.next().charAt(0);
        }
         for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
        System.out.println("enter the elements of the array :");
        for(int i=0;i<c.length;i++)
        {
            c[i]=in.nextFloat();
        }
         for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
        System.out.println("enter the elements of the array :");
        for(int i=0;i<d.length;i++)
        {
            d[i]=in.nextDouble();
        }
         for(int i=0;i<d.length;i++)
        {
            System.out.print(d[i]);
        }
    }
}
	    
