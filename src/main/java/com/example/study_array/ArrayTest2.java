package com.example.study_array;

public class ArrayTest2 {

    public static void main(String[] args) {
        ArrayTest2 t2 = new ArrayTest2();
        t2.test();
    }
    public void test() {

        String[] arr = new String[5];
        arr[0] = "딸기";
        arr[1] = "복숭아";
        arr[2] = "키위";
        arr[3] = "사과";
        arr[4] = "바나나";

        System.out.println(arr[4]);
    }

}
