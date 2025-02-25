import java.util.*;
interface A{
    void test();
}
interface B
{
    void test();
}
public class Main implements A,B
{
    	public void test()
		{
		    System.out.println("test");
		}
	public static void main(String[] args) {
		Main o=new Main();
		o.test();
	}
		
}