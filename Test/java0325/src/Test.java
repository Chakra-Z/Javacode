import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        B b = new B();
//        System.out.println(b.f(10.0, 8.0));
//        System.out.println(B.g(3));
//        A a = b;
//        System.out.println(a.f(10.0, 8.0));
//        System.out.println(A.g(3));

        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            System.out.println(s.next()+s.nextLine());
        }
    }
}
class A{
    double f(double x, double y){
        return x+y;
    }
    static int g(int n){
        return n*n;
    }
}
class B extends A{
    @Override
    double f(double x, double y){
        double m = super.f(x,y);
        return m+x*y;
    }
    static int g(int n){
        int m = A.g(n);
        return m+n;
    }
}