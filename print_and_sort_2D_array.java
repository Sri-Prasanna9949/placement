import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int a[][]=new int [3][3];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value of the array at the "+i+" the and "+j+" th position");
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
               
            }
            System.out.println();
        }
        sortArray(a);
    }
    public static void sortArray(int [][] arr)
    {
        int x=arr.length;
        int y=arr[0].length;
        int arr1[]=new int [x*y];
        int k=0;
        for (int i=0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                arr1[k]=arr[i][j];
                k++;
            }
        }
         for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        k=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                arr[i][j]=arr1[k];
                k++;
            }
        }
        System.out.println();
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(arr[i][j]+" ");
               
            }
            System.out.println();
        }
        
    }
}
	    
