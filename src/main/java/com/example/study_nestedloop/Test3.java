package com.example.study_nestedloop;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Test3 ts = new Test3();
        ts.test();
    }
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num; i < (num*2)-1; i++) {
            for(int j = num; j <= i; j++) {
                System.out.print(" ");
            }

            for(int k = (num*2)-1 ; k > i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}