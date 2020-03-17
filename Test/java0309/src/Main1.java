import java.util.Scanner;

public class Main1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextInt()) {
                int m = sc.nextInt(), n = sc.nextInt();
                int evenICount = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2);
                int oddICount = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2);
                int ans = m / 4 * (evenICount + oddICount) * 2;
                if (m % 4 > 0) ans += evenICount;
                if (m % 4 > 1) ans += evenICount;
                if (m % 4 > 2) ans += oddICount;
                System.out.println(ans);
            }
        }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()) {
//            int w = scanner.nextInt();
//            int h = scanner.nextInt();
//            int result = method(w-1)* method(h-1);
//            System.out.println(result);
//        }
//    }
//
//    private static int method(int n) {
//        if(n < 0){
//            return 0;
//        }
//        if(n == 0 || n == 1 || n == 2) {
//            return 1;
//        }else{
//            return method(n-3) + 1;
//        }
//    }
}
