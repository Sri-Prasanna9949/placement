import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        String name;
        int regno;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the no of Students :");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            name=getName();
            regno=getRegno();
            printDetails(name,regno);
            System.out.println();
        }
    }
    public static String getName()
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the name :");
        return in.nextLine();
    }
    public static int getRegno()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the register number :");
        return in.nextInt();
    }
    public static void printDetails(String x,int y)
    {
        System.out.println("The Name is :"+x);
        System.out.println("The Register number is :"+y);
    }
}
	    
