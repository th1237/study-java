package com.example.study_controller;

public class Test2 {

    public static void main(String[] args) {

        for(int i = 2; i <= 5; i++) {
            if(i % 2 == 1) for (int j = 1; j < 10; j++) {
                if (j % 2 == 1) System.out.printf("%d * %d = %d%n", i, j, i * j);

            }

            System.out.println();

        }

    }

}
