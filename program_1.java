import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int n1=in.nextInt();
        System.out.println("Enter the coloumns : ");
        int n2=in.nextInt();
        int a[][]= new int[n1][n2];
        int a1[]=new int[n1*n2];
        int k=0;
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
                a1[k]=a[i][j];
                k++;
            }
        }
        int m=0;
        int max=a1[m];
        int max2=a1[m];
        int max3=a1[m];
        
        for(int i=1;i<a1.length;i++)
        {
            if(max<a1[i])
            {
                max=a1[i];
            }
            else
            {
                continue;
            }
        }
        for(int i=1;i<a1.length;i++)
        {
            if(max2<a1[i] && a1[i]<max)
            {
                max2=a1[i];
            }
            else
            {
                continue;
            }
        }
        for(int i=1;i<a1.length;i++)
        {
            if(max3<a1[i] && a1[i]<max2)
            {
                max3=a1[i];
            }
            else
            {
                continue;
            }
        }
        System.out.println("The third maximum Number is : "+max3);
    }
}