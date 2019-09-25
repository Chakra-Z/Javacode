class LinkedNode {
    public int data;
    public LinkedNode next = null;
}
public class SingleLinkedList {
    private LinkedNode head = null; // 头结点

    // 打印链表
    public void display() {
        System.out.print("[");
        for (LinkedNode node = head; node != null; node = node.next) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 头插法
    public void addFirst(int data) {
        // 1、创建要插入的结点
        LinkedNode node = new LinkedNode();
        node.data = data;
        // 2、如果链表为空
        if (head == null) {
            head = node;
            return;
        }
        // 3、非空链表
        node.next = head;
        head = node;
    }

    // 尾插法
    public void addLast(int data) {
        // 1、创建要插入的结点
        LinkedNode node = new LinkedNode();
        node.data = data;
        // 2、如果链表为空
        if (head == null) {
            head = node;
            return;
        }
        // 3、如果为非空链表,先找到最后一个结点
        LinkedNode cur = head;
        for (cur = head; cur.next != null; cur = cur.next) {
            // 循环结束 cur 为最后一个结点
        }
        cur.next = node;
    }

    // 插入到 index 位置
    public void addIndex(int index, int data) {
        // 1、创建要插入的结点
        LinkedNode node = new LinkedNode();
        node.data = data;
        // 2、插入位置合法性判断,需要知道链表长度
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        // 3、头插
        if (index == 0) {
            addFirst(data);
        }
        // 4、尾插
        if (index == len) {
            addLast(data);
        }
        // 5、中间插入，找到 index - 1 位置元素
        LinkedNode prev = getIndex(index - 1);
        node.next = prev.next;
        prev.next = node;
    }
    private LinkedNode getIndex(int index) {
        LinkedNode cur = head;
        int i = 0;
        while (i < index) {
            cur = cur.next;
            i++;
        }
        return cur;
    }
    private int size() {
        int size = 0;
        for (LinkedNode cur = this.head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    // 查找是否有关键字 key
    public boolean contains(int key) {
        // 遍历即可
        for (LinkedNode cur = head; cur != null; cur = cur.next) {
            if (cur.data == key) {
                return true;
            }
        }
        return false;
    }

    // 删除第一次出现的关键字 key 结点
    public void removeKey(int key) {
        // 1、空链表直接return
        if (head == null) {
            return;
        }
        // 2、头结点
        if (head.data == key) {
            head = null;
        }
        // 3、中间删除，找到前一个
        LinkedNode prev = searchPrev(key);
        prev.next = prev.next.next;
    }
    private LinkedNode searchPrev(int key) {
        for (LinkedNode prev = head; prev.next != null; prev = prev.next) {
            if (prev.next.data == key) {
                return prev;
            }
        }
        return null;
    }
}