import java.util.*;

public class GoUpstairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(countWays(scanner.nextInt()));
        }
    }

    public static int countWays(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        return (countWays(n-1)+countWays(n-2)+countWays(n-3));
    }
}