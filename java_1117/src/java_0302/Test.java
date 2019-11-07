package java_0302;

public class Test {

	public static void main(String[] args) {
		People xiaoming = new People("小明");
		
		xiaoming.setAge(18);
		xiaoming.setHigh(183);
		System.out.println(xiaoming.toString()+" 年龄："
					+xiaoming.getAge()+ " 身高："+ xiaoming.getHigh());
	}

}
