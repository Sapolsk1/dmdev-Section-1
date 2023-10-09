package com.dmdev.cs.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {

    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>(5);
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        integers1.add(6);

        System.out.println(integers1);

    }
}
