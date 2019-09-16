import java.util.Scanner;

public class PassWord{
    public static void main(String[] args) {
        int key = 123456;
        System.out.println("请输入密码: ");
        int n = 1;
        do{ 
            Scanner scanner = new Scanner(System.in);
            int password = scanner.nextInt();
            if(password == key){
                break;
            }else{
                System.out.println("密码错误，请重新输入");
                n++;
            }
        }while(n <= 3);
        if(n <= 3){
            System.out.println("登录成功！！！");   
        }else{
            System.out.println("三次错误，退出程序！！！！！！");
        }
    }
}