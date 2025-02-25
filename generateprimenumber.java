class Main
{
    public static void main(String args[])
    {
        for(int i=0;i<=100;i++)
        {
            if(checkprime(i))
            {
               System.out.println(i);
            }
        }
        
    }
    static boolean checkprime(int x)
    {
        int n=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                n++;
            }
        }
        if(n==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}