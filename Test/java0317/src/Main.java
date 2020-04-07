import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i, scanner.nextInt());
        }
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < 10; i++){
            int j = list.get(i);
            while(j != 0){
                str.append(i);
                j--;
            }
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 0) {
               String newStr = swap(str, 0 , i);
               System.out.println(newStr);
               break;
            }
        }

    }
    private static String swap(StringBuffer str, int index0, int indexi){
        String newStr = str.toString();
        char[] c = newStr.toCharArray();
        char temp = c[index0];
        c[index0] = c[indexi];
        c[indexi] = temp;
        return c.toString();
    }
}
