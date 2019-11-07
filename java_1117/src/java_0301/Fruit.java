package java_0301;

public class Fruit {
	private String fruitName;
    private int input;

    public Fruit(String fruitName, int input) {
        this.fruitName = fruitName;
        this.input = input;
    }

    public int gain() {
        return input*2;
    }

    public int getInput() {
        return input;
    }

    @Override
    public String toString() {
        return  fruitName +
                " ³É±¾Îª£º" + input +" " ;
    }
}
