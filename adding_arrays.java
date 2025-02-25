public class Main
{
    public static void main(String[] args) {
        int a[]={5,1,3,7};
        int b[]={9,7,7};
        int l=a.length;
        int n=b.length;
        int rem=0;
        int carry=0;
        int sum=0;
        int i=0;
        if(l==n)
        {
            int c[]=new int[l+1];
            for(i=0;i<l;i++)
            {
                sum=a[i]+b[i];
                sum=sum+carry;
                c[i]=sum%10;
                carry=sum/10;
            }
            c[i]=carry;
            for(i=0;i<l+1;i++)
            {
            System.out.println(c[i]);
            }
        }
        else if(l>n)
        {
            int c[]=new int[l];
            for(i=0;i<n;i++)
            {
                sum=a[i]+b[i];
                sum=sum+carry;
                c[i]=sum%10;
                carry=sum/10;
            }
            for(int j=n;j<n+(l-n);j++)
            {
                c[j]=a[j]+carry;
            }
            for(i=0;i<l;i++)
            {
            System.out.println(c[i]);
            }
        }
        else
        {
            int c[]=new int[n];
            for(i=0;i<l;i++)
            {
                sum=a[i]+b[i];
                sum=sum+carry;
                c[i]=sum%10;
                carry=sum/10;
            }
            for(int j=l;j<l+(n-l);j++)
            {
                c[j]=b[j]+carry;
            }
            for(i=0;i<n;i++)
            {
            System.out.println(c[i]);
            }
        }
    }
}
	    
