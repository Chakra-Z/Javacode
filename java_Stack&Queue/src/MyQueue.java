// 使用链表实现队列
class Node {
    int val;
    Node next;

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    Node(int val) {
        this.val = val;
    }
}

public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    // 入队列
    public void offer(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    // 出队列
    public int poll() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        Node oldHead = head;
        head = head.next;
        // 如果只有一个元素，头和尾都要删
        if (head == null) {
            tail = null;
        }
        size--;
        return oldHead.val;
    }

    // 取队首元素
    public int peek() {
        if (head == null) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args){
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        while (!myQueue.isEmpty()) {
            int curFront = myQueue.peek();
            System.out.println(curFront);
            myQueue.poll();
            //System.out.println(myQueue.poll());
        }
    }
}
