package com.Test;

import java.util.Scanner;

public class Main3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String str = scanner.nextLine();
//            String result = method(str);
//            System.out.println(result);
//        }
//    }
    private static String method(String str) {
        int max = 0;
        int count = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
                if (max < count) {
                    max = count;
                    end = i;
                }
            } else {
                count = 0;
            }
        }
        return str.substring(end-max+1,end);
    }
}
