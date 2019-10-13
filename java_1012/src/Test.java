public class Test {
    public static void main(String[] args){
        testAddFirst();
        testAddLast();
        testAddIndex();
        testContains();
    }
    public static void testAddFirst() {
        DLinkedList list = new DLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        System.out.println("测试头插：");
        list.display();
    }

    public static void testAddLast() {
        DLinkedList list = new DLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println("测试尾插：");
        list.display();
    }

    public static void testAddIndex() {
        DLinkedList list = new DLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("测试插入前：");
        list.display();

        list.addIndex(2,10);
        System.out.println("测试插入后：");
        list.display();
    }

    public static void testContains() {
        DLinkedList list = new DLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        boolean result = list.contains(3);
        System.out.println("测试是否存在指定值：" + result);
    }

    public static void testRemove() {
        DLinkedList list = new DLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(4);
        System.out.println("测试删除前：");
        list.display();

        list.remove(2);
        System.out.println("测试删除后：");
        list.display();
    }

    public static void testRemoveAll() {
        DLinkedList list = new DLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(4);
        System.out.println("测试删除前：");
        list.display();

        list.removeAll(2);
        System.out.println("测试删除后：");
        list.display();
    }
}
