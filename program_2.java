import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{5,4,7},{1,8,3},{9,6,2}};
        int row=arr.length;
        int column=arr[0].length;

        int a[] = new int[row * column];
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[index++] = arr[i][j];
            }
        }
        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
            {
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
                
            }
            else
            {
                continue;
            }
            }
            
        }

        index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = a[index++];
            }
        }

        System.out.println("\nSorted Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
