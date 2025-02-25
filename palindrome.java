import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int x=121;
	    int y=324;
	    if(checkPalindrome(x))
	    {
	        System.out.println("its palindrome");
	    }
	    else{
	        System.out.println("its not a palindrome");
	    }
	    if(checkPalindrome(321))
	    {
	        System.out.println("its palindrome");
	    }
	    else{
	        System.out.println("its not a palindrome");
	    }
	}
	public static boolean checkPalindrome(int x)
	{
	    int rem;
	    int sum=0;
	    int temp=x;
	    while(x>0)
	    {
	        rem=x%10;
	        sum=sum*10+rem;
	        x=x/10;
	    }
	    if(temp==sum)
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
