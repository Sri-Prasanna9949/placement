public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i]);
		}
		 System.out.println();
		for(int j=arr.length-1;j>=0;j--)
		{
		    System.out.println(arr[j]);
		}
		System.out.println();
		for(int k:arr)
		{
		    System.out.println(k);
		}
	}
}