import java.util.Scanner;

public class JumpFloor {
    public static void main(String[] args) {
        System.out.print("请输入数字:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("递归求解:"+jump1(n));
        System.out.println("非递归求解:"+jump2(n));
    }

    public static int jump1(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        return jump(n-1)+jump(n-2);
    }

    public static int jump2(int n) {
        if(n == 1) {
            return 1;
        }else if(n == 2) {
            return 2;
        }
        int s1 = 1;
        int s2 = 2;
        int sn = 0;
        for(int i = 3; i <=n; i ++) {
            sn = s1 + s2;
            s1 = s2;
            s2 = sn;
        }
        return sn;
    }
}