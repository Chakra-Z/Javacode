public class CountNum{
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int count = 0;
        for(i = 0; i <= 100; i++){
            if(i/10 == 9 || i%10 == 9){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count = "+count);
    }
}