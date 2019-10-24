package package_LibManagementSystem;

import package_LibManagementSystem.book.BookList;
import package_LibManagementSystem.user.Admin;
import package_LibManagementSystem.user.NormalUser;
import package_LibManagementSystem.user.User;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        // 创建书籍列表信息
        BookList bookList = new BookList();
        // 创建用户(多态)
        User user = login();
        // 主循环
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的角色：(1. 普通用户  2. 管理员)");
        int role = scanner.nextInt();
        if (role == 1) {
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}
