package java_0301;
public class Test {
	public static void main(String[] args) {
		// �����������
        Fruit apple = new Apple("ƻ��",500);
        Fruit banana = new Banana("�㽶",300);
        System.out.println(apple + "����Ϊ��" +apple.gain());
        System.out.println(banana + "����Ϊ��" +banana.gain());

        // ����Ԫ�ص���gain����
        Fruit[] fruit = new Fruit[4];
        fruit[0] = new Apple("ƻ��", 500);
        fruit[1] = new Banana("�㽶", 300);
        fruit[2] = new Apple("ƻ��", 500);
        fruit[3] = new Apple("ƻ��", 500);

        for (int i = 0; i < 4; i++) {
            System.out.println(fruit[i] + "����Ϊ��" + fruit[i].gain());
        }
	}
}
