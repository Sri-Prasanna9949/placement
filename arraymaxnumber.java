public class Main
{
	public static void main(String[] args) {
		int arr[]={2,5,7,4,9};
		int max=arr[0];
		int max2=arr[0];
		int max3=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]>max)
		   {
		       max=arr[i];
		   }
		}
		System.out.println("the greatest number is "+max);
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>max2 && arr[i]!=max)
		    {
		        max2=arr[i];
		    }
		}
			System.out.println("the second greatest number is "+max2);
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>max3 && arr[i]!=max && arr[i]!=max2)
		    {
		        max3=arr[i];
		    }
		}
			System.out.println("the third greatest number is "+max3);
	}
}