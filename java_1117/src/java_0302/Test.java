package java_0302;

public class Test {

	public static void main(String[] args) {
		People xiaoming = new People("С��");
		
		xiaoming.setAge(18);
		xiaoming.setHigh(183);
		System.out.println(xiaoming.toString()+" ���䣺"
					+xiaoming.getAge()+ " ��ߣ�"+ xiaoming.getHigh());
	}

}
