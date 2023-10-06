package com.golovachcourses.generics;

import java.util.ArrayList;

public class WildCardUpperBound {

    public static void main(String[] args) {
        ArrayList<? super Integer> ref = new ArrayList<>();
        ref.add(1);
//        Integer ref2 = ref.get(0);
    }
}
