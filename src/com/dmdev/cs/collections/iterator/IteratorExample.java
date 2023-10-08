package com.dmdev.cs.collections.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
