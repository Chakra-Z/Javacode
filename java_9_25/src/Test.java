public class Test {
    public static void main(String[] args){
        testAddFirst();
        testAddLast();
        testAddIndex();
        testContains();
        testRemove();
        testRemoveAllKey();
    }
    public static void testAddFirst() {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        System.out.println("头插法结果：");
        list.display();
    }

    public static void testAddLast() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("尾插法结果：");
        list.display();
    }

    public static void testAddIndex() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addIndex(3,20);
        System.out.println("按下标插入结果：");
        list.display();
    }
    public static void testContains() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        boolean result = list.contains(3);
        System.out.println("查找结果："+result);
    }

    public static void testRemove() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.removeKey(3);
        System.out.println("删除结果：");
        list.display();
    }

    public static void testRemoveAllKey() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.removeAllKey(3);
        System.out.println("删除结果：");
        list.display();
    }
}
