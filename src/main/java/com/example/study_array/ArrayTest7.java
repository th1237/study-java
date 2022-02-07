package com.example.study_array;

public class ArrayTest7 {

    public static void main(String[] args) {

        int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
        int[] copyAr = new int[array.length * array[0].length];

        int a = 0;

        for (int i = 0; i < array.length; i++) {

            inner:
            for (int j = 0; j < array[i].length; j++) {


                if (array[i][j] % 3 == 0) {

                    for (int k = 0; k < copyAr.length; k++) {

                        if (copyAr[k] == array[i][j])
                            continue inner;
                    }

                    copyAr[a] = array[i][j];
                    a++;

                }

            }

        }

        System.out.print("copyAr : ");
        for (int copy : copyAr) {

            if (copy == 0) continue;

            System.out.print(copy + " ");

        }
    }
}
