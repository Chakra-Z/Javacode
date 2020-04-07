import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int result = getTotalCount(month);
        System.out.println(result);
    }
    private static int getTotalCount(int m) {
        if(m == 0){
            return 0;
        }
        if(m == 1 || m == 2) {
            return 1;
        }
        return getTotalCount(m - 1) + getTotalCount(m - 2);
    }
}
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextLine()){
//            String str = new String(scanner.nextLine());
//            String result = method(str);
//            System.out.println(result);
//        }
//    }
//    private static String method(String s){
//        int len = s.length();
//        char[] arr = new char[len];
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < len; i++){
//            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'E') {
//                arr[i] = (char)((int)s.charAt(i) + 21);
//                sb.append(arr[i]);
//            }else if(s.charAt(i) == ' '){
//                arr[i] = ' ';
//                sb.append(arr[i]);
//            }else {
//                arr[i] = (char)((int)s.charAt(i) - 5);
//                sb.append(arr[i]);
//            }
//        }
//
//        return sb.toString();
//    }
//}
