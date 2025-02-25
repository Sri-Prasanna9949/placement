public class Main
{
	public static void main(String[] args) 
	{
	    int arr[]={1,3,4,5,0,6,7,9,0,5,0,3};
	    int n=arr.length;
	    int arr1[]=new int[n];
	    int index=0;
	    for(int i=0;i<n;i++)
	   {
	       if(arr[i]!=0)
	       {
	           arr1[index++]=arr[i];
	       }
	   }
	   for(int i=index;i<n;i++)
	   {
	       arr1[i]=0;
	   }
	   for(int i=0;i<n;i++)
	   {
	       System.out.println(arr1[i]);
	   }
	}
}