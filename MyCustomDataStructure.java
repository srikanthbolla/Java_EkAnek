package com.company;

import java.util.Arrays;

public class MyCustomDataStructure{
    static int[] arr;
    MyCustomDataStructure(int n){
        arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)Math.pow((double)i,2);
        }
    }

    public static void main(String[] ags) {
        MyCustomDataStructure number= new MyCustomDataStructure(4);
        add(1,4);
        sum(0,arr.length);
    }

   static void add(int index,int value){
        arr[index]=value;
    }

    static void sum(int startIndex, int endIndex){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

}
