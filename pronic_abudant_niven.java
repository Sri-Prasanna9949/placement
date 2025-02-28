class Calculate
{
    public void base(int n)
    {
        int c1=0;
        int c2=0;
        int c3=0;
        if(pronic(n))
        {
            c1++;
        }
        if(abundant(n))
        {
            c2++;
        }
        if(niven(n))
        {
            c3++;
        }
        if(c1==0 && c2==0 && c3==0)
        {
            System.out.println("the given number "+n+" is not pronic , not abudant and not niven ");
        }
        else if(c1==0 && c2==0 && c3==1)
        {
            System.out.println("the given number "+n+" is neither pronic  nor abudant  but niven ");
        }
        else if(c1==0 && c2==1 && c3==0)
        {
            System.out.println("the given number "+n+" is neither pronic  nor niven  but abudant ");
        }
        else if(c1==1 && c2==0 && c3==0)
        {
            System.out.println("the given number "+n+" is neither abundant nor niven but pronic ");
        }
        else if(c1==0 && c2==1 && c3==1)
        {
            System.out.println("the given number "+n+" is not pronic but abudant and niven");
        }
        else if(c1==1 && c2==0 && c3==1)
        {
            System.out.println("the given number "+n+" is not abudant but pronic and niven");
        }
        else if(c1==1 && c2==1 && c3==0)
        {
            System.out.println("the given number "+n+" is not niven but abudant and pronic ");
        }
        else if(c1==1 && c2==1 && c3==1)
        {
            System.out.println("the given number "+n+" is  pronicn , abudant and niven");
        }
        else
        {
            System.out.println("null");
        }
    }
    public boolean pronic(int n)
    {
        int n1=n;
        //System.out.println(n);
        for(int i=1;i<n1;i++)
        {
            if(i*(i+1)==n1)
            {
                //System.out.println("the given number "+n+" is pronic number ");
                //break;
                return true;
            }
            else
            {
                //System.out.println(" the given number is not pronic number ");
                continue;
            }
        }
        return false;
    }
    public boolean abundant(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                //System.out.println("factor : "+i);
                sum=sum+i;
            }
        }
        //System.out.println("sum :"+sum);
        if(sum>n)
        {
            //System.out.println("the given number "+n+" is abudant number ");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean niven(int n)
    {
        int n1=n;
        int r=0;
        int sum=0;
        while(n1>0)
        {
           r=n1%10;
           sum=sum+r;
           n1=n1/10;
        }
        if(n%sum==0)
        {
            //System.out.println("the given number "+n+" is niven number ");
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Main 
{
    public static void main(String [] args)
    {
        Calculate o= new Calculate();
        o.base(10);
        o.base(12);
        o.base(18);
    }
}