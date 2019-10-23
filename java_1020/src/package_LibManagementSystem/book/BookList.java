package package_LibManagementSystem.book;

public class BookList {
    private Book[] book = new Book[100];
    private int size;

    public BookList() {
        book[0] = new Book("红楼梦","001","曹雪芹",100,"经典名著",false);
        book[1] = new Book("三国演义","002","罗贯中",100,"经典名著",false);
        book[2] = new Book("水浒传","003","施耐庵",100,"经典名著",false);
        book[3] = new Book("西游记","004","吴承恩",100,"经典名著",false);
        size = 4;
    }

    public Book getBook(int index) {
        return book[index];
    }

    public void setBook(int index, Book book) {
        this.book[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
