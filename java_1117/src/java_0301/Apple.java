package java_0301;

public class Apple extends Fruit {
	public Apple(String fruitName, int input) {
        super(fruitName, input);
    }
    @Override
    public int gain() {
        return getInput()*2+200;
    }
}
