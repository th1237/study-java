package com.example.study_array;

public class ArrayTest1 {

    public static void main(String[] args) {
        ArrayTest1  t1 = new ArrayTest1 ();
        t1.test();
    }
    public void test() {
        int[] arr = new int[100];

        for(int i : arr) {
            arr[i] += ( i + 1 );
            System.out.println(arr[i]);
        }
    }
}