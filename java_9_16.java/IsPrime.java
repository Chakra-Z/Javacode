import java.util.Scanner;

public class IsPrime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isPrime = true;
        if(x == 1 || x % 2 == 0 && x != 2){
            isPrime = false;
        }
        else{
            for(int i = 3; i < Math.sqrt(x); i += 2){
                if(x % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(x+" is prime");
        }
        else{
            System.out.println(x+" is not prime");
        }
   } 
}