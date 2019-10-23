package package_LibManagementSystem.operation;

import package_LibManagementSystem.book.BookList;

public class Exit implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统!");
        System.exit(0);
    }
}
