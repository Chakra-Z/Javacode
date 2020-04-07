import java.util.*;

public class Gift {
//    public int getValue(int[] gifts, int n) {
//        for(int i = 0; i < n; i++) {
//            gifts[i]
//        }
//    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }

            while (i < j && array[i] <= pivot) {
                i++;
            }
            swap(array, i, j);
        }
        swap(array, i, left);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}