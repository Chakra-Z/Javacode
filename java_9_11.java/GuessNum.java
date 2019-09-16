import java.util.Random;
import java.util.Scanner;

public class GuessNum{
    public static void main(String[] args){
        Random random = new Random();
        int key = random.nextInt(100)+1;
        System.out.print("请输入数字：");
        while(true){
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input < key){
                System.out.println("猜小了，请重新输入");
            }else if(input > key){
                System.out.println("猜大了，请重新输入");
            }else{
                System.out.println("恭喜你！猜中了！");
                break;
            }
        }
    }
}