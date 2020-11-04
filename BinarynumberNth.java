package com.company;
import java.util.*;
public class BinarynumberNth {
    public static void main(String[] ags) {

        System.out.println(getNthBinaryNumberWithKOnes(2,5));

    }


    static String getNthBinaryNumberWithKOnes(int k, int N) {
        //here i have take in the range 0to 100
        // if we increase the range we will get answer in between the range
        int[] binary = new int[100];
        int j = 0;
        for (int i = 0; i < 100; i++) {
            int c = countSetBits(i);
            if (c == k) {
                binary[j] =decToBinary(i);
                j = j + 1;
            }
        }

        String s="";
        s=s+binary[N-1];

        return s;
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    static int decToBinary(int n) {

        int b = 0;
        int count = 0;
        while (n != 0)
        {
            int rem = n % 2;
            double c = Math.pow(10, count);
            b += rem * c;
            n/= 2;
            count++;
        }

        return b;
    }
}
