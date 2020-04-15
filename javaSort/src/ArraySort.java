public class ArraySort {

    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    // 插入排序(模拟接牌整牌)
    private static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int v = arr[i];
            int p = i;
            while(p > 0 && arr[p-1] > v){
                arr[p] = arr[p-1];
                p--;
            }
            arr[p] = v;
        }
    }

    // 冒泡排序(大数沉底，小数冒起来了)
    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int k = 0; k < arr.length-i-1; k++){
                if(arr[k] > arr[k+1]){
                    swap(arr,k,k+1);
                }
            }
        }
    }

    // 快速排序(左右指针循环处理直到相遇)
    private static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int key = arr[left];
        int l = left;
        int r = right;
        while(l < r){
            while (l<r && arr[r]>key){
                r--;
            }
            if(l < r){
                //arr[left] = arr[right];
                swap(arr,l,r);
                l++;
            }
            while (l<r && arr[l]<key){
                l++;
            }
            if(l < r){
                //arr[right] = arr[left];
                swap(arr,l,r);
                r--;
            }
        }
        //arr[left] = key;
        quickSort(arr, left, l-1);
        quickSort(arr, l+1, right);
    }

    // 堆排序(堆化(heapify)-->建堆(buildHeap)-->堆排序(heapSort))
    private static void heapSort(int[] tree, int n){
        buildHeap(tree, n);
        for(int i = n-1; i >= 0; i--) {
            swap(tree, i, 0);
            heapify(tree, 0, i);
        }
    }

    private static void buildHeap(int[] tree, int n){
        int lastNode = n-1;
        int parent = (lastNode-1)/2;
        for(int i = parent; i >= 0; i--) {
            heapify(tree, i, n);
        }
    }
    private static void heapify(int[] tree, int i, int n){
        int c1 = 2*i+1;
        int c2 = 2*i+2;
        int max = i ;
        if(c1 < n && tree[max] < tree[c1]){
            max = c1;
        }
        if(c2 < n && tree[max] < tree[c2]){
            max = c2;
        }
        if(max != i){
            swap(tree, i, max);
            heapify(tree, max, n);
        }
    }

    // 选择排序(从剩余的部分选出最值)
    private static void selectSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    swap(arr,min,j);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{2,9,8,7,6,4};
        int n = array.length;
        //quickSort(array,0,n - 1);
        //heapify(array,0,7) ;
        //heapSort(array,n);
        selectSort(array);

        for (int i : array){
            System.out.print(i + " ");
        }
    }

}

