public class Test{
    public static void main(String[] args) {
        int n = 5;
        int result = fac(n);
        System.out.println(n+" != "+result);
    }

    public static int fac(int x) {
        if(x == 1){
            return 1;
        }else{
            return x * fac(x - 1);
        }
    }

    
    
    public static void main(String[] args) {
        int n = 1234;
        print(n);
    }
    public static void print(int x) {
        if(x > 9){
            print(x / 10);
        }
        System.out.print(x % 10+" ");
    }

    public static void main(String[] args) {
        int n = 1234;
        int result = add(n);
        System.out.println("result = "+result);
    }
    public static int add(int x){
        if(x < 10){
            return x;
        }else{
            return x%10 + add(x/10);
        }
    }

    public static void main(String[] args) {
        int a = 15, b = 2, c = 1;
        int max, min ;
        if(a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        if(c > max){
            max = c;
        }
        if(c < min){
            min = c;
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }

    public static void main(String[] args){
        int age = 28;
        if(age <=18)
        {
            System.out.println("少年");
        }else if(age>18 && age<=28){
            System.out.println("青年");
        }else if(age>28 && age<=55){
            System.out.println("中年");
        }else if(age>=56){
            System.out.println("老年");
        }
    }
}