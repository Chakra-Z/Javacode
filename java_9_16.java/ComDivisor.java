public class ComDivisor{
    public static void main(String[] args) {
        int a = 36;
        int b = 48;
        int min = a < b ? a : b;
        for(int i = min; i >= 1; i --) {
            if(a % i == 0 && b % i == 0) {
                System.out.println("common divisor is: "+i);
                break;
            }
        }
    }
}