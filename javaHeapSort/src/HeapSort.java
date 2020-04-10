public class HeapSort {
    public static void main(String[] args) {
        int[] tree = new int[]{5, 4, 8, 1, 9, 15, 3};
        // int[] tree1 = new int[]{9, 15, 8, 1, 3, 4, 5};
        int n = 7;
        // heapify(tree1,n,0);
        heapSort(tree, n);
        for(int i = 0; i < n; i++){
            System.out.print(tree[i] +" ");
        }
    }

    // 建大顶堆，找max; 建小顶堆，找min
    // heapify() 对保证所有子树都是堆的节点(i)实现堆化
    private static void heapify(int[] tree, int n, int i){
        int c1 = 2*i+1;   // 左子树
        int c2 = 2*i+2;     // 右子树
        // 1. 找出i, c1, c2中的最大值(确保c1, c2存在)
        int max = i;
        if(c1 < n && tree[c1] > tree[max]) {
            max = c1;
        }
        if(c2 < n && tree[c2] > tree[max]) {
            max = c2;
        }
        // 2. 如果 max 不是 i ，则交换 max 与 i 的位置
        if(max != i) {
            swap(tree, max, i);
            // 3. 对max节点递归做heapify.
            heapify(tree, n, max);
        }
    }

    private static void swap(int[] tree, int i, int j) {
        int temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }

    // 从最后一个非叶子节点开始，循环使用heapify()函数建堆
    private static void buildHeap(int[] tree, int n) {
        // 1. 找到最后一个非叶子节点
        int lastNode = n - 1;
        int pLastNode = (lastNode-1) / 2;
        // 2. 从最后一个非叶子节点开始，循环使用heapify
        for(int i = pLastNode; i >= 0; i--) {
            heapify(tree,n,i);
        }
    }

    private static void heapSort(int[] tree, int n){
        // 1. 建堆
        buildHeap(tree,n);
        // 2. 交换堆顶元素tree[0]和最后一个元素tree[i]
        //    交换结束后[0,i)是无序区间 [i,n)是有序区间
        for(int i = n - 1; i >= 0; i--) {
            swap(tree, i, 0);
            // 3. 交换结束后, [0,i)的区间符合heapify条件
            heapify(tree, i, 0);
        }
    }
}
