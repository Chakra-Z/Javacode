package java_0302;

public class People {
	private String name;
	private int age;
	private int high;
	
	public People(String name) {
		this.name = name;
	}
	
	public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
    
    public String toString() {
    	return name+"";
    }
}
