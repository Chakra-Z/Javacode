import java.util.Scanner;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            BigInteger n1 = scanner.nextBigInteger();
            BigInteger n2 = scanner.nextBigInteger();
            System.out.println(n1.add(n2));
        }
    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int a = scanner.nextInt();
//            String ch = scanner.nextLine();
//            method(a, ch);
//        }
//    }
//    private static void method(int a, String ch) {
//        int b = 0;
//        if(a % 2 == 0) {
//            b = a/2;
//        }else {
//            b = a/2+1;
//        }
//        char c = ch.charAt(1);
//        for(int i = 0; i < a; i++) {
//            System.out.print(c);
//        }
//        System.out.println();
//        for(int j = 0; j < b-2; j++) {
//            System.out.print(c);
//            for(int i = 0; i < a-2; i++) {
//                System.out.print(" ");
//            }
//            System.out.print(c);
//            System.out.println();
//        }
//        for(int i = 0; i < a; i++) {
//            System.out.print(c);
//        }
//        System.out.println();
//    }
//}