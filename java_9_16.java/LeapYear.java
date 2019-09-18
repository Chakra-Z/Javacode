public class LeapYear{
    public static void main(String[] args) {
        int i = 1000;
        for(i = 1000; i <= 2000; i++)
        {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}