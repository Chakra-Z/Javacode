class DLinkedNode {
    public int val = 0;
    public DLinkedNode prev = null;
    public DLinkedNode next = null;

    public DLinkedNode(int val) {
        this.val = val;
    }
}
public class DLinkedList {
    private DLinkedNode head = null;

    // 创造傀儡结点
    public DLinkedList() {
        head = new DLinkedNode(-1);
        head.prev = head;
        head.next = head;
    }

    // 打印链表
    public void display() {
        System.out.print("[");
        for (DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            System.out.print(cur.val);
            if (cur.next != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    // 头插
    public void addFirst(int data) {
        DLinkedNode node = new DLinkedNode(data);
        DLinkedNode next = head.next;

        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }

    // 尾插
    public void addLast(int data) {
        DLinkedNode node = new DLinkedNode(data);
        DLinkedNode prev = head.prev;

        prev.next = node;
        node.prev = prev;
        node.next = head;
        head.prev = node;
    }

    // 插入到 index 位置，从 0 开始
    public void addIndex(int index, int data) {
        // 检查 index 合法性, 使用 size() 求链表长度
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        if (index == 0) {
            addFirst(data);
        }
        if (index == len) {
            addLast(data);
        }
        DLinkedNode node = new DLinkedNode(data);
        DLinkedNode next = getIndex(index);
        DLinkedNode prev = next.prev;

        prev.next = node;
        node.prev = prev;
        node.next = next;
        next.prev = node;
    }
    private int size() {
        int size = 0;
        for (DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            size++;
        }
        return size;
    }
    private DLinkedNode getIndex(int index) {
        DLinkedNode pos = head.next;
        for (int i = 0; i < index; i++) {
            pos = pos.next;
        }
        return pos;
    }

    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        for (DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            if (cur.val == key) {
                return true;
            }
        }
        return false;
    }
}
