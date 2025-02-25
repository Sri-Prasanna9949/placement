public class Main
{
    public static void main(String[] args) {
        int a[]={1,3,2,10,20,5};
        int l=a.length;
        int n=3;
        int n1=l-n;
        int temp=0;
        int i=0;
        for(i=0;i<l-n;i++)
        {
            temp=a[i];
            a[i]=a[n1];
            a[n1]=temp;
            if(n1<l)
            {
                n1++;
            }
        }
        for(i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
	    
