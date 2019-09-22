public class SeqList {
    private int[] Arr = new int[10];
    private int size = 0;

    // 打印顺序表
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(Arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println(size);
    }

    // 在pos位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > size) {
            // 插入位置非法，直接返回
            return;
        }
        // 当前位置不够，进行扩容，自定义方法realloc
        if (this.size >= this.Arr.length) {
           realloc();
        }
        // 尾插
        if (pos == size) {
            this.Arr[pos] = data;
            size++;
            return;
        }
        // 从中间插入
        for (int i = size - 1; i >= pos; i--) {
            this.Arr[i + 1] = this.Arr[i];
        }
        this.Arr[pos] = data;
        size++;
    }

    private void realloc(){
        int[] newArr = new int[this.Arr.length * 2];
        for (int i = 0; i < this.Arr.length; i++) {
            newArr[i] = this.Arr[i];
        }
        this.Arr = newArr;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < size; i++) {
            if (this.Arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
//        for (int i = 0; i < size; i++) {
//            if (this.Arr[i] == toFind) {
//                return true;
//            }
//        }
//        return false;
        return (search(toFind) != -1);// 使用自定义search方法
    }

    // 获取 pos 位置元素
    public int getPos(int pos) {
        return this.Arr[pos];
    }

    // 给 pos 位置元素设为 value
    public void setPos(int pos, int value) {
        this.Arr[pos] = value;
    }

    // 删除第一次出现的关键字value
    public void remove(int value) {
        int pos = search(value);
        // 关键字不存在直接返回
        if (pos == -1) {
            return;
        }
        // 关键字在表尾，直接size--
        if (pos == size - 1) {
            size --;
            return;
        }
        // 关键字在表中间，依次移动
        for (int i = pos; i < size - 1; i++) {
            this.Arr[i] = this.Arr[i + 1];
        }
        size--;
    }

    // 获取顺序表长度
    public int size() {
        return size;
    }

    // 清空顺序表
    public void clear() {
        size = 0;
        this.Arr = new int[10];
    }
}
