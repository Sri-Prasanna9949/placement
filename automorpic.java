import java.util.*;
 
class overload
{
    public void automorphic(int x)
    {
        int multi=x*x;
        if(x<10)
        {
            if(x==multi%10)
            {
                System.out.println("the number "+x+" is automorphic!");
            }
            else
            {
                System.out.println("the number "+x+" is not a automorphic!");
            }
        }
        else
        {
            if(x%10==multi%10)
            {
                System.out.println("the number "+x+" is automorphic!");
            }
            else
            {
                System.out.println("the number "+x+" is not a automorphic!");
            }
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    overload o= new overload();
	    o.automorphic(2);
	    o.automorphic(5);
	    o.automorphic(100);
	    o.automorphic(10);
	    o.automorphic(25);
	    o.automorphic(625);
	}
}