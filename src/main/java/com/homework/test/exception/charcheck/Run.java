package com.homework.test.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Run rn = new Run();
        rn.test1();
    }

    public void test1() {

        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();
        System.out.print("문자열 입력: ");
        String s = sc.nextLine();
        int count = cp.countAlpha(s);
        System.out.printf("%s에 알파벳은 %d개 있습니다.", s, count);
    }
}
