import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = method(n);
        System.out.println(str);
    }

    private static String method(int n) {
        String str = n+"";
        StringBuffer s = new StringBuffer();
        for(int i = str.length()-1; i >= 0; i--) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long m = method1(n);
//        System.out.println(m);
//        int result = method(m);
//        System.out.println(result);
//    }
//
//    private static long method1(long n) {
//        if(n == 1) {
//            return 1;
//        }else{
//            return method1(n-1)*n;
//        }
//    }
//
//    private static int method(long n) {
//        String str = n+"";
//        int len = str.length();
//        int count = 0;
//        for(int i = len-1; i >= 0; i--) {
//            char c = str.charAt(i);
//            if(c == '0'){
//                count++;
//            }else {
//                break;
//            }
//        }
//        return count;
//    }
//}