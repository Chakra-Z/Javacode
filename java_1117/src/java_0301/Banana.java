package java_0301;

public class Banana extends Fruit{
	public Banana(String fruitName, int input) {
        super(fruitName, input);
    }

    @Override
    public int gain() {
        return getInput()*3;
    }
}
