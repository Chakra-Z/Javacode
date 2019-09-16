import java.util.Scanner;

public class Number{
    public static void main(String[] args) {
        System.out.print("请输入整数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("打印结果：");
        Print(num);
    }
    public static void Print(int x){
        if(x > 9){
            Print(x / 10);
        }
        System.out.print(x % 10+" ");
    }
}