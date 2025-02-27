class calci
{
    public void calculate(int x)
    {
        int total=1;
        for(int i=1;i<=x;i++)
        {
            total=total*i;
        }
        System.out.println("factorial of "+x+" is : "+total);
    }
    public void calculate()
    {
        int p=0;
        int c=1;
        int s=0;
        System.out.print(p+" ");
        System.out.print(c+" ");
        for(int i=0;i<7;i++)
        {
            s=p+c;
            System.out.print(s+" ");
            p=c;
            c=s;
            
        }
        
    }
    public void calculate(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {
            if(checkPrime(i))
        {
            System.out.print(i+" ");
        }
        else
        {
            continue;
        }
    }
    }
    boolean checkPrime(int z)
    {
        int count=0;
        for(int i=1;i<=z;i++)
        {
            if(i==1)
            {
                
            }
            if(z%i==0)
            {
                count++;
            }
            else
            {
                continue;
            }
        }
        if(count==2 || count==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    
public class Main
{
	public static void main(String[] args) {
		calci o = new calci();
		o.calculate(5);
		System.out.println();
		o.calculate();
		System.out.println();
		System.out.println();
		o.calculate(1,11);
	}
}