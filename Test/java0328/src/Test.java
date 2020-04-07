public class Test {


    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    // 插入排序
    private static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int v = arr[i];
            int p = i;
            while(p>0 && arr[p-1]>v){
                arr[p] = arr[p-1];
                p--;
            }
            arr[p] = v;
        }
    }

    // 冒泡排序
    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int k = 0; k < arr.length-i-1; k++){
                if(arr[k] > arr[k+1]){
                    swap(arr,k,k+1);
                }
            }
        }
    }

    // 快速排序
    private static void quickSort(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int key = arr[l];
        int left = l;
        int right = r;
        while(left < right){
            while(left<right && arr[right]>=key){
                right--;
            }
            if(left < right){
                //swap(arr,left,right);
                arr[left] = arr[right];
                left++;
            }
            while(left<right && arr[left]<=key){
                left++;
            }
            if(left < right){
                //swap(arr,left,right);
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = key;
        quickSort(arr,l,left-1);
        quickSort(arr,left+1, r);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,9,8,7,6,2};
        //insertSort(arr);
        //bubbleSort(arr);
        quickSort(arr,0,arr.length-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
