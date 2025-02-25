public class Main
{
	public static void main(String[] args) 
	{
	    int arr[]={3,2,3,1,2,9};
	    int l=arr.length;
	    int count=0;
	    int arr1[]=new int[l];
	    int k=0;
	    for(int i=0;i<l;i++)
	    {
	        for(int j=i+1;j<l;j++)
	        {
	            if(arr[i]==arr[j])
	            {
	                 arr[j]=-1;
	            }
	            else{
	                continue;
	            }
	        }
	    }
	    for(int i=0;i<l;i++)
	    {
	        if(arr[i]!=-1)
	        {
	            arr1[k]=arr[i];
	            k++;
	            
	        }
	        else
	        {
	            continue;
	        }
	    }
	    for(int i=0;i<l;i++)
	    {
	        if(arr1[i]!=0)
	        {
	            count++;
	        }
	    }
	     for(int i=0;i<count;i++)
	     {
	         System.out.print(arr1[i]);
	     }
	}
}