public class Test {
    static SeqList list = new SeqList();

    public static void main(String[] args){
        listDisplay(); // 打印顺序表
        listAdd(); // 在pos位置新增元素
        listSearch(); // 查找某个元素对应的位置
        listContains(); // 判定是否包含某个元素
        listGetPos(); // 获取 pos 位置元素
        listSetPos(); // 给 pos 位置元素设为 value
        listRemove(); // 删除第一次出现的关键字value
        listSize(); // 获取顺序表长度
        listClear(); // 清空顺序表

    }

    // 打印顺序表
    public static void listDisplay() {
        list.display();
    }

    // 在pos位置新增元素
    public static void listAdd() {
        list.add(0,1);
        list.add(1,3);
        list.add(2,5);
        list.add(3,7);
        list.add(4,9);
        list.display();
    }

    // 查找某个元素对应的位置
    public static void listSearch(){
        int result = list.search(5);
        System.out.println("result应该是 2，实际是 "+result);
    }

    // 判定是否包含某个元素
    public static void listContains() {
        boolean result = list.contains(9);
        System.out.println("result应该是 true，实际是 "+result);
    }

    // 获取 pos 位置元素
    public static void listGetPos() {
        int result = list.getPos(2);
        System.out.println("result应该是 5，实际是 "+result);
    }

    // 给 pos 位置元素设为 value
    public static void listSetPos() {
        list.setPos(3,15);
        list.display();
    }

    // 删除第一次出现的关键字value
    public static void listRemove() {
        list.remove(9);
        list.display();
    }

    // 获取顺序表长度
    public static void listSize() {
        int result = list.size();
        System.out.println("result应该是 5，实际是 "+result);
    }
    
    // 清空顺序表
    public static void listClear() {
        list.clear();
        list.display();
    }
}
