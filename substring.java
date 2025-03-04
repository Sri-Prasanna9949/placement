import java.util.*;

public class Main
{
    static void str()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        int n=s.length();
        System.out.println("The Sub String is : "+s.substring(2,n-1));
    }
    static void strbff()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        int n=s.length();
        StringBuffer ss= new StringBuffer(s);
        System.out.println("The Sub String is : "+ss.substring(2,n));
    }
    static void strbuild()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        int n=s.length();
        StringBuilder ss= new StringBuilder(s);
        System.out.println("The Sub String is : "+ss.substring(2,n));
    }
    public static void main(String args[])
    {
        str();
        System.out.println();
        strbff();
        System.out.println();
        strbuild();
    }
}