public class Main
{
	public static void main(String[] args) 
	{
	    int arr[]={1,1,0,1,1,0,0,1,1,1,1,1,0,1};
	    int prev=0;
	    int count=0;
	    int prev1=0;
	    int count1=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==1)
	        {
	            count++;
	        }
	     
	        else 
	        {
	            if(count>prev)
	                prev=count;
	            count=0;
	        }
	    }
	    if(count>prev)
	        prev=count;
	    System.out.println(prev);
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==0)
	        {
	            count1++;
	        }
	     
	        else 
	        {
	            if(count1>prev1)
	                prev1=count1;
	            count1=0;
	        }
	    }
	    if(count1>prev1)
	        prev1=count1;
	    System.out.println(prev1);
	}
}