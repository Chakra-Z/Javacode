package com.Test;

import java.util.Scanner;

public class Main2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//            int d = scanner.nextInt();
//            method(a,b,c,d);
//        }
//
//    }

    private static void method(int a, int b, int c, int d) {
        for(int A = -30; A <= 30; A++) {
            for(int B = -30; B < 30; B++) {
                for(int C = -30; C < 30; C++) {
                    if((A-B == a) && (B-C == b) && (A+B ==c) && (B+C == d)) {
                        System.out.println(A+" "+B+" "+C);
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }
}
