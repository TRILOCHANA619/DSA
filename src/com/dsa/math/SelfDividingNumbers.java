package com.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> output = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            System.out.println("number" + num);
            boolean isSelfDividing = true;
            while (num != 0) {
                int temp = num % 10;
                System.out.println(temp);
                if (temp == 0 || i % temp != 0) {
                    isSelfDividing = false;
                    break;
                }
                num /= 10;
            }
            if (isSelfDividing) {
                if (!output.contains(i)) {
                    output.add(i);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {

    }
}
