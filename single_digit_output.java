public class Main
{
    public static void main(String[] args) {
        int X = 3;
        int N = 5;
        int sum = 0;
        int num = 0;
        for (int i = 0; i < N; i++) {
            num = num * 10 + X;
            sum += num;
        }
        int result = getSingleDigit(sum);
        System.out.println("Output: " + result);
    }
    public static int getSingleDigit(int num) {
        while (num > 10) {
            int rem = 0;
            while (num > 0) {
                rem += num % 10;
                num /= 10;
            }
            num = rem;
        }
        return num;
    }
}
	    
