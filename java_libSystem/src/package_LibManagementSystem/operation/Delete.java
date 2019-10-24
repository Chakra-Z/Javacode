package package_LibManagementSystem.operation;

import package_LibManagementSystem.book.Book;
import package_LibManagementSystem.book.BookList;

import java.util.Scanner;

public class Delete implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除书籍编号：");
        String id = scanner.next();
        // 先查找书籍
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getId() .equals(id)) {
                // 找到直接 break
                break;
            }
        }
        // 遍历结束还没找到
        if (i >= bookList.getSize()) {
            System.out.println("未找到要删除书籍！");
            return;
        }
        // 对书籍进行删除操作，用最后一本书对要删除书籍进行覆盖
        Book lastBook = bookList.getBook(bookList.getSize()-1);
        bookList.setBook(i,lastBook);
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功！");
    }
}
