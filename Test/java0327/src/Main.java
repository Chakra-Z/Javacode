import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        float sum = 0;
        float count = 0;
        int max = 0;
        float a4 = sum / count;
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] % 5 == 0 && arr[i] % 2 == 0){
                a1 += arr[i];
            }
            int y = 0;
            if(arr[i] % 5 == 1){
                int x = arr[i];
                y++;
                a2 = method(a2,x,y);
            }
            if(arr[i] % 5 == 2){
                a3++;
            }
            if(arr[i] % 5 == 3){
                sum += (float)arr[i];
                count++;
            }
            if(arr[i] % 5 == 4){
                max = arr[i] > max ? arr[i] : max;
            }
        }
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+max);
    }
    private static int method(int a, int x,int y){
        if(y % 2 == 1){
            a += x;
        }
        if(y % 2 == 0){
            a -= x;
        }
        return a;
    }
}

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str1 = new String(scanner.nextLine());
//        String str2 = new String(scanner.nextLine());
//        Map map1 = method(str1);
//        Map map2 = method(str2);
//        int n = str2.length()-1;
//        while(n != 0){
//            map2.get(n);
//            n--;
//        }
//    }
//    private static Map<Character, Integer> method(String s1) {
//        int len1 = s1.length();
//        char[] arr = s1.toCharArray();
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < len1; i++){
//            if(map.containsKey(arr[i])){
//                int num = map.get(arr[i]);
//                map.put(arr[i], num+1);
//            }else {
//                map.put(arr[i], 1);
//            }
//        }
//        return map;
//    }
//}
