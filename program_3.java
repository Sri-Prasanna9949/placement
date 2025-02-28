import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{5,4,7},{1,8,3},{9,6,2}};
        int row=arr.length;
        int column=arr[0].length;
        int a[][]= new int[row][column];
        int temp=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(i!=j)
                {
                    arr[j][i]=arr[i][j];
                }
                else
                {
                    arr[i][j]=arr[i][j];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
