package com.golovachcourses.generics;

public class Mock {

    public static <T> T mock(T arg) {
        return null;
    }

    class MockTest {
        public static void main(String[] args) {
            Integer i = mock(1);
            String s = mock("Str");
        }
    }
}
