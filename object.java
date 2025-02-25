import java.util.Scanner;
class Add
{
    private int a,b,c;
    public void get()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a=in.nextInt();
        System.out.println("Enter the value of b : ");
        b=in.nextInt();
    }
    public int sum()
    {
        c=a+b;
        return c;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Add a = new Add();
	    a.get();
	    int s = a.sum();
	    System.out.println("sum = "+s);
	}
}

