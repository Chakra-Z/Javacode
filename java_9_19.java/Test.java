import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,9};
        // 打印数组
        printArray(arr);

        // 自己实现数组转字符串
        System.out.println(toString(arr));

        // 使用方法实现数组转字符串
        System.out.println(Arrays.toString(arr));

        // 自己实现拷贝数组
        System.out.println(Arrays.toString(copyOf(arr)));
        
        // 使用方法拷贝数组
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));

        // 找出数组中最大值
        System.out.println(max(arr));

        //求数组元素平均值
        System.out.println(avg(arr));

        // 查找元素(顺序查找)
        System.out.println(find(arr, 7));

        // 数组排序(冒泡排序)
        bubbleSort(arr); 
        System.out.println(Arrays.toString(arr)); 

        // 查找元素(二分查找)_针对有序数组
        System.out.println(binarySearch(arr, 7));

        // 检查数组的有序性 
        System.out.println(isSorted(arr)); 

        // 数组逆置
        reverse(arr);
        System.out.println(Arrays.toString(arr)); 
    }

    //打印数组
    public static void printArray(int[] a) {
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
    // 自己实现数组转字符串
    public static String toString(int[] a) {
        String x = "[";
        for(int i = 0; i < a.length; i++){
            x += a[i]; // 使用字符串相加即可
            if (i != a.length - 1) {
                x += ", ";
            }
        }
        x += "]";
        return x;
    }

    // 自己实现拷贝数组
    public static int[] copyOf(int[] a) {
        int[] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[i];
        }
        return ret;
    }

    // 找出数组中最大值
    public static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //求数组元素平均值
    public static double avg(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return (double)sum / (double)a.length;
    }

    // 查找元素(顺序查找)
    public static int find(int[] a, int toFind) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == toFind) {
                return i; // 找到返回下标
            }
        }
        return -1; // 没找到返回-1
    }

    // 数组排序(冒泡排序)
    public static void  bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int k = 0; k < a.length - i - 1; k++) {
                if (a[k] > a[k + 1]) {
                    int tmp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = tmp;
                }
            }
        }
    } 

    //查找元素(二分查找)
    public static int binarySearch(int[] a, int toFind) {
        int left = 0;
        int right = a.length - 1;
        while (a[left] <= a[right]) {
            int mid = (left + right) / 2;
            if (a[mid] < toFind) {
                left = mid + 1;
            }else if (a[mid] > toFind) {
                right = mid - 1;
            }else if (a[mid] == toFind) {
                return mid; // 找到返回下标
            }
        }
        return -1; //没找到返回-1
    }

    // 检查数组的有序性(是否升序)
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i]){
                return false;
            }
        }
        return true;
    }

    // 数组逆序
    public static void reverse(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }
    }
}