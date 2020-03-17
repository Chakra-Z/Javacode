import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int result = method2(a, b);
//            System.out.println(result);
//        }
//    }

    // 先求最大公约数
    private static int method(int a, int b) {
        int min = a<b?a:b;
        while(true) {
            if(a%min==0 && b%min==0) {
                return min;
            }
            min--;
        }
    }

    // 再求最小公倍数
    private static int method2(int a, int b) {
        int min = method(a, b);
        return (a/min)*(b/min)*min;
    }
}
