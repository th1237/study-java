package com.example.Test;

import java.util.Random;

public class Test_MultiDimentionalArray {

    public static void main(String[] args) {
        Test_MultiDimentionalArray sp = new Test_MultiDimentionalArray();
//			sp.exercise1();
        sp.exercise2();
    }

    public void exercise1() {
        Random rnd = new Random();

        int[][] arr = new int[3][5];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rnd.nextInt(100)+1;

                if(arr[i][j] % 5 == 0)
                    System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
            }
        }

    }

    public void exercise2() {
        Random rnd = new Random();
        int sum = 0;

        int[][] arr = new int[3][4];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length-1; j++) {
                arr[i][j] = rnd.nextInt(100)+1;
                sum += arr[i][j];
            }
            arr[i][3] = sum;
            sum = 0;
        }

        System.out.println("0열 1열 2열 3열");

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d행 ", i);
            for(int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}

