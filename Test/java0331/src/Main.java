import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = n*n;
            System.out.println(method(n)+" "+method(m));
        }
    }
    public static int method(int n){
        int sum = 0;
        while(n != 0){
            int x = n%10;
            sum += x;
            n = n/10;
        }
        return sum;
    }
}