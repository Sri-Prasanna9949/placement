import java.util.*;

public class Main {
    static boolean abundant(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>n)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n1=in.nextInt();
        System.out.print("Enter the column : ");
        int n2=in.nextInt();
        int a[][]= new int[n1][n2];
        System.out.println("Enter the Array elements : ");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(abundant(a[i][j]))
                {
                    count++;
                    System.out.println("The Number "+a[i][j]+" is abundant");
                }
            }
        }
         System.out.println("The total number of abundant numbers present in the given array is : "+count);
        if(count%2==0)
        {
            System.out.println("The array element has even numbers of abudant numbers!");
        }
        else
        {
            System.out.println("The array element has odd numbers of abudant numbers!");
        }
    }
}
