package package_LibManagementSystem.operation;

import package_LibManagementSystem.book.BookList;

public class PrintAll implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("打印所有书籍信息");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
        System.out.println("共计图书 "+ bookList.getSize() +" 本");
    }
}
