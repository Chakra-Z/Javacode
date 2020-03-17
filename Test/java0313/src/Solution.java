import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3};

        int[] B = multiply(A);
        System.out.println(B);
    }
    public static int[] multiply(int[] A) {
        int len = A.length;
        if(len == 0 || len == 1) {
            return null;
        }
        int[] B = new int[len];
        for(int i = 0; i < len; i++) {
            int temp = A[i];
            A[i] = 1;
            B[i] = 1;
            for(int j = 0; j < len; j++){
                B[i] *= A[j];
            }
            A[i] = temp;
        }
        return B;
    }
}
