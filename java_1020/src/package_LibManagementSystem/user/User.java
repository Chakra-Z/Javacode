package package_LibManagementSystem.user;

import package_LibManagementSystem.book.BookList;
import package_LibManagementSystem.operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    abstract public int menu();

    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
