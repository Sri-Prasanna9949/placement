class Main
{
    public static void main(String args[])
    {
    int x=4;
    int n=0;
        for(int i=1;i<=7;i++)
        {
            if(x%i==0)
            {
                n++;
            }
        }
        if(n==2)
        {
            System.out.println("it is a prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
}