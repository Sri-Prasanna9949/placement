class Solution {
    public boolean isPalindrome(int x) {
        int x1= x;
        int sum=0;
        if(x<0)
        {
            return false;
        }
        else if (x>0)
        {
            while(x1>0)
            {
                int rem=x1%10;
                sum=sum*10+rem;
                x1/=10;
            }
        }
        return x==sum;

    }
}