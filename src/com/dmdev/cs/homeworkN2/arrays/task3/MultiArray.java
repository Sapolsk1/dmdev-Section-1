package com.dmdev.cs.homeworkN2.arrays.task3;

import com.dmdev.cs.homeworkN2.arrays.task3.arrays.NegativeArray;
import com.dmdev.cs.homeworkN2.arrays.task3.arrays.PositiveArray;
import com.dmdev.cs.homeworkN2.arrays.task3.arrays.ZeroArray;
import com.dmdev.cs.homeworkN2.arrays.task3.counter.NegativeCounter;
import com.dmdev.cs.homeworkN2.arrays.task3.counter.PositiveCounter;
import com.dmdev.cs.homeworkN2.arrays.task3.counter.ZeroCounter;

import java.util.Arrays;


public class MultiArray {

    public static void getMultiArray() {
        NegativeCounter negativeCounter = new NegativeCounter();
        PositiveCounter positiveCounter = new PositiveCounter();
        ZeroCounter zeroCounter = new ZeroCounter();
        int negativeCount = negativeCounter.getCount(MainTask3.arr);
        int zeroCount = zeroCounter.getCount(MainTask3.arr);
        int positiveCount = positiveCounter.getCount(MainTask3.arr);
        int[] negativeArray = NegativeArray.getArray(negativeCount, MainTask3.arr);
        int[] zeroArray = ZeroArray.getArray(zeroCount, MainTask3.arr);
        int[] positiveArray = PositiveArray.getArray(positiveCount, MainTask3.arr);

        int[][] resultArray = new int[3][10];
        resultArray[0] = negativeArray;
        resultArray[1] = zeroArray;
        resultArray[2] = positiveArray;
        System.out.println("Двумерный массив: " + Arrays.deepToString(resultArray));
    }

}
