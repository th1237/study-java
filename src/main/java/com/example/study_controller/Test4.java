package com.example.study_controller;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int inputNum1 = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int inputNum2 = sc.nextInt();

        int result = inputNum1 * inputNum2;

        if ((inputNum1 > 0 && inputNum1 < 10) &&
                (inputNum2 > 0 && inputNum2 < 10)) {

            if (result < 10) {

                System.out.println("한자리 수 입니다.");

            } else {

                System.out.println("두자리 수 입니다.");
            }

        }

    }
}
