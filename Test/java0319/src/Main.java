import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < (2*n); j++) {
                list.add(scanner.nextInt());
            }
            while(k != 0){
                ArrayList<Integer> list1 = new ArrayList<>(list.subList(0, n));
                ArrayList<Integer> list2 = new ArrayList<>(list.subList(n, 2*n));
                list = method(list1,list2);
                k--;
            }
            for(int x = 0; x < (2*n); x++){
                System.out.print(list.get(x));
                if(i != t-1 || x != (2*n)-1) {
                    System.out.print(" ");
                }
            }

        }
    }

    // 洗牌过程，返回一个新的list
    private static ArrayList<Integer> method( ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
            list.add(list2.get(i));
        }
        return list;
    }
}
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()) {
//            int n = scanner.nextInt();
//            int[] score = new int[n];
//            for(int i = 0; i < n; i++) {
//                score[i] = scanner.nextInt();
//            }
//            int result = scanner.nextInt();
//            int count = getNum(score, result);
//            System.out.println(count);
//        }
//    }
//    private static int getNum(int[] arr, int result) {
//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == result) {
//                count++;
//            }
//        }
//        return count;
//    }
//}