package com.dmdev.cs.streamApi;

import java.util.ArrayList;
import java.util.Comparator;

public class lambdaExample {

    public static void main(String[] args) {
//        Comparator<Integer> comparator = new IntegerComparator();
        //анонимный класс
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        };
        Comparator<Integer> comparator1 = Integer::compare;
        System.out.println(comparator1.compare(25, 100));
    }

//    public static class IntegerComparator implements Comparator<Integer> {

//        @Override
//      [модиф.] возвр тип название([параметры])
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }


//        @Override
//      [модиф.] возвр тип название([параметры])

//       (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
//    }
}
