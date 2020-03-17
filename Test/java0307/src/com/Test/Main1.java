package com.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        while(scanner.hasNextInt()){
//            list.add(scanner.nextInt());
//        }
//        method(list);
//    }


    private static void method(ArrayList list) {
        Collections.sort(list);
        int size = list.size();
        int result = (int)list.get(size/2 - 1);
        System.out.println(result);
    }
}
