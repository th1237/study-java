package com.homework.test.workshop;

public class T2 {
    public static void main(String[] args) {
        int[][] arr2 = {
                {20, 30, 10},
                {50, 40, 60},
                {80, 80, 90}
        };
        for(int i = arr2.length-1 ; i>-1;i--){
            for(int j = arr2[i].length-1 ;j >-1 ;j--){
                System.out.print(arr2[i][j] + " ");
            }
        }
    }
}
