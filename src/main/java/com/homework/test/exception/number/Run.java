package com.homework.test.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run rn = new Run();
        rn.test();
    }

    public void test() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 01 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 02 입력: ");
        int b = sc.nextInt();

        NumberProcess np = new NumberProcess();
        if(np.checkDouble(a, b)==true)
            System.out.printf("%d는 %d의 배수입니다.", a, b);
        else
            System.out.printf("%d는 %d의 배수가 아닙니다.", a, b);

    }
}
