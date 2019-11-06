public class MyQueue2 {
    private int[] data = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    // 入队列，如果队满返回false，插入成功返回true
    public boolean offer(int val) {
        if (size == data.length) {
            return false;
        }
        data[tail] = val;
        tail++;
        if (tail == data.length) {
            tail = 0;
        }
        size++;
        return true;
    }

    // 出队列
    public int poll() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        int ret = data[head];
        head++;
        if (head == data.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    // 取队首元素
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        int ret = data[head];
        return ret;
    }

    // 判定为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 取长度
    public int size() {
        return size;
    }

    public static void main(String[] args){
        MyQueue2 myQueue2 = new MyQueue2();
        myQueue2.offer(1);
        myQueue2.offer(2);
        myQueue2.offer(3);
        myQueue2.offer(4);
        while (!myQueue2.isEmpty()) {
            int curFront = myQueue2.peek();
            System.out.println(curFront);
            myQueue2.poll();
        }
    }
}
