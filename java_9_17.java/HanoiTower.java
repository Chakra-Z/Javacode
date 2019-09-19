import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        System.out.print("请输入数字:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Tower(n, 'A', 'B', 'C');
    }
    public static void Tower(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from "+ from + " to " + to);
        }else {
            Tower(topN - 1, from, to, inter);
            System.out.println("Disk "+ topN + " from " + from + " to " + to);
            Tower(topN - 1, inter, from, to);
        }
    }
}