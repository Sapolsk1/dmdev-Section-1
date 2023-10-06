package com.golovachcourses.generics;

import java.util.ArrayList;

public class WildCardLowerBound {

    public static void main(String[] args) {
        ArrayList<? extends Integer> ref = new ArrayList<>();
//        ref.add(1);
        Integer ref2 = ref.get(0);
    }
}
