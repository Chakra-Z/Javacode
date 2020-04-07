import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] words = str.split(" ");
//        for(int i = words.length; i > 0; i--){
//            System.out.print(words[i]+" ");
//        }
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(countNumberOf2s(n));
        }

    }
    public static int countNumberOf2s(int n) {
        int count = 0;
        for(int i = 0; i <= n; i++){
            String s = i+"";
            for(char ch: s.toCharArray()){
                if(ch == '2'){
                    count++;
                }
            }
        }
        return count;
    }
}