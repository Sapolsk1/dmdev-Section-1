package com.golovachcourses.generics;

import java.util.Arrays;

public class GenericHolderTest<T> {

    public static void main(String[] args) {
        GeneticHolder<String> geneticHolder = new GeneticHolder<>();
        geneticHolder.setData("String");
        String data = geneticHolder.getData();
        System.out.println(data);

        GeneticHolder<int[]> geneticHolder1 = new GeneticHolder<>();
        geneticHolder1.setData(new int[]{1, 2, 3, 4});
        int[] data1 = geneticHolder1.getData();
        System.out.println(Arrays.toString(data1));
    }
}
