package java_0301;
public class Test {
	public static void main(String[] args) {
		// 创建两类对象
        Fruit apple = new Apple("苹果",500);
        Fruit banana = new Banana("香蕉",300);
        System.out.println(apple + "收益为：" +apple.gain());
        System.out.println(banana + "收益为：" +banana.gain());

        // 数组元素调用gain方法
        Fruit[] fruit = new Fruit[4];
        fruit[0] = new Apple("苹果", 500);
        fruit[1] = new Banana("香蕉", 300);
        fruit[2] = new Apple("苹果", 500);
        fruit[3] = new Apple("苹果", 500);

        for (int i = 0; i < 4; i++) {
            System.out.println(fruit[i] + "收益为：" + fruit[i].gain());
        }
	}
}
