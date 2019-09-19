import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("请输入数字:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("递归求解:"+Fib1(n));
        System.out.println("非递归求解:"+Fib2(n));
    }

    public static int Fib1(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }else {
            return Fib2(n - 1) + Fib2(n - 2);
        }

    }

    public static int Fib2(int n) {
        if(n < 2){
            return 1;
        }
        int fib1 = 1;
        int fib2 = 1;
        int fibn = 0;
        for(int i = 3; i <= n; i++){
            fibn = fib1 + fib2;
            fib2 = fib1;
            fib1 = fibn;
        }
        return fibn;
    }
}