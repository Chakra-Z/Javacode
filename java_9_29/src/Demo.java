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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newHead = null;
        ListNode newTail = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                // 就把 cur1 指向的节点插入到新链表的尾部
                if (newHead == null) {
                    // 新链表是空链表
                    newHead = cur1;
                    newTail = cur1;
                    cur1 = cur1.next;
                } else {
                    // 新链表不是空链表
                    newTail.next = cur1;
                    // 更新尾部的指向.
                    newTail = newTail.next;
                    cur1 = cur1.next;
                }
            } else {
                // 就把 cur2 指向的节点插入到新链表的尾部
                if (newHead == null) {
                    newHead = cur2;
                    newTail = cur2;
                    cur2 = cur2.next;
                } else {
                    newTail.next = cur2;
                    newTail = newTail.next;
                    cur2 = cur2.next;
                }
            }
        }
        // 如何判定当前哪个链表到达结尾, 哪个链表还有剩余?
        if (cur1 == null) {
            // cur2 还有剩余
            newTail.next = cur2;
        } else {
            // cur1 还有剩余
            newTail.next = cur1;
        }
        return newHead;
    }
}




