import java.util.Scanner;

public class Bin{
    public static void main(String[] args) {
        System.out.println("请输入想要求的数字：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while(num != 0){
            int bin = num % 2;
            if(bin == 1){
                count ++;
            }
            num = num / 2;
        }
        System.out.println("count = "+count);  
        scanner.close();
    }
}