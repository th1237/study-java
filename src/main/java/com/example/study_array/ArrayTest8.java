package com.example.study_array;

public class ArrayTest8 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double sum = 0;

        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0)
                continue;
            else sum += i;
        }

        System.out.println("합계 : " + sum);

    }

}
