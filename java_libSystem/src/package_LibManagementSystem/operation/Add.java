package package_LibManagementSystem.operation;

import package_LibManagementSystem.book.Book;
import package_LibManagementSystem.book.BookList;

import java.util.Scanner;

public class Add implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请新增书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入 ID：");
        String id = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入价格：");
        int price = scanner.nextInt();
        System.out.println("请输入类型：");
        String type = scanner.next();

        Book book = new Book(name,id,author,price,type,false);
        bookList.setBook(bookList.getSize(),book);
        bookList.setSize(bookList.getSize()+1);
    }
}
