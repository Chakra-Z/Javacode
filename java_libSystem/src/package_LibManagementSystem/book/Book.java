package package_LibManagementSystem.book;

public class Book {
    String name;
    String id;
    String author;
    int price;
    String type;
    boolean isBorrowed;

    public Book(String name, String id, String author,
                int price, String type, boolean isBorrowed) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
