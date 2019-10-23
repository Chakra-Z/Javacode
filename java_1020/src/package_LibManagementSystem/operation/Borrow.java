package package_LibManagementSystem.operation;

import package_LibManagementSystem.book.Book;
import package_LibManagementSystem.book.BookList;

import java.util.Scanner;

public class Borrow implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅书籍的编号：");
        String id = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (! book.getId() .equals(id)) {
                continue;
            }
            if (book.isBorrowed()) {
                System.out.println("这本书已经被借走了！");
                break;
            }
            book.setBorrowed(true);
        }
    }
}
