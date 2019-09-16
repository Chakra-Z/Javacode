public class NarciNum{
    public static void main(String[] args) {
       int n;
       for(n = 100; n < 1000; n++){
          int a = n % 10;
          int b = (n / 10) % 10;
          int c = (n / 100) % 10;
        
          if(a*a*a + b*b*b + c*c*c == n){
              System.out.println(n);
          }
       } 
    }
}