class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}

public class Demo {
    //  删除链表中等于给定值 val 的所有节点
    public ListNode removeElements(ListNode head, int val) {
        // 处理空链表
        if (head == null) {
            return null;
        }
        // 处理非头结点
        // 删除需要找到前一个结点prev和要删除节点node
        ListNode prev = head;
        ListNode node = head.next;
        // 循环比较
        while (node != null) {
            if (node.val == val) {
                // 删除结点
                prev.next = node.next;
                node = prev.next;
            }else{
                prev = node;
                node = node.next;
            }
        }
        // 处理头结点
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }

    // 反转一个链表
    public ListNode reverseList(ListNode head) {
        // 链表为空或者只有一个结点则不需要逆置
        if (head == null){
            return null;
        }
        if (head.next == null) {
            return head;
        }
        // 记录三个节点位置
        ListNode prev = null;
        ListNode cur = head;
        ListNode newHead = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                newHead = cur;
            }
            cur.next = prev; // 逆置
            prev = cur;
            cur = next;
        }
        return newHead;
    }

    // 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
    // 如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 输入一个链表，输出该链表中倒数第k个结点
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = size(head);
        if(head == null || k <= 0 || k > len){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (k != 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static int size (ListNode head) {
        ListNode node = head;
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }
}




