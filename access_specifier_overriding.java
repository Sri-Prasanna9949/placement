import java.util.Scanner;
class Example
{
   public void method1()
   {
       System.out.println(" Public ");
   }
   private void method2()
   {
       System.out.println(" Private ");
   }
   protected void method3()
   {
       System.out.println(" Protected ");
   }
   static void method4()
   {
       System.out.println(" Static ");
   }
   void method5()
   {
       System.out.println(" default ");
   }
}
    
    class Deriveclass extends Example{
        
        public void method1(){
            System.out.println(" public in derived class");
        }
        protected void method3()
        {
            System.out.println(" protected in derived class");
        }
        public void method5()
        {
            System.out.println(" default in derived class");
        }
    }

public class Main{
    
        public static void main(String[] args) {
            
		Example a=new Deriveclass();
		a.method1();
		a.method3();
		a.method5();
	}
}
	
