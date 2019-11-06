// 利用顺序表实现Stack，即使用尾插+尾删的方式实现
public class MyStack {
    private int[] array = new int[100];
    private int size = 0;

    // 入栈
    public void push(int val) {
        array[size] = val;
        size++;
        // array[size++] = val;
    }

    // 出栈
    public Integer pop() {
        if (size == 0) {
            return null;
        }
        int ret = array[size - 1];
        size--;
        return ret;
    }

    // 取栈顶元素
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return array[size - 1];
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 求栈的长度
    public int size() {
        return size;
    }

    public static void main(String[] args){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        while (!myStack.isEmpty()) {
            int curFront = myStack.peek();
            System.out.println(curFront);
            myStack.pop();
        }
    }
}
