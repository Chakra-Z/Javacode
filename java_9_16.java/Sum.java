public class Sum{
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double ret = 0;
        int i = 0;
        for(i = 1; i <= 100; i ++){
            if(i % 2 == 0){
                a += (-1.0 / i);
            }
            else{
                b += 1.0 / i;
            }
        }
        ret = a + b;
        System.out.println("vasul is : "+ret);
    }
}