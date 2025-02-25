public class Main
{
	public static void main(String[] args) 
	{
	    int arr[]={3,2,3,1,2,9};
	    int l=arr.length;
	    for(int i=0;i<l;i++)
	    {
	        int count=1;
	        for(int j=i+1;j<l;j++)
	        {
	             if(arr[i]==arr[j])
	                {
	                    count++;
	                    arr[j]=-1;
	                }
	        }
	        if(arr[i]!=-1)
	        {
	        System.out.println("the number "+arr[i]+" present "+count+" times in the array");
	        }
	    }
	}
}