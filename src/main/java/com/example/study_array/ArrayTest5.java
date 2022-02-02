package com.example.study_array;

import java.util.Scanner;

public class ArrayTest5 {

    public static void main(String[] args) {
        ArrayTest5 t5 = new ArrayTest5();
        t5.test();
    }
    public void test() {
        Scanner sc = new Scanner(System.in);
        String num = " ";

        System.out.print("주민등록번호 입력 :  ");
        num = sc.next();

        char str[] = new char[num.length()];
        for(int i=0; i<str.length;i++) {
            str[i]=num.charAt(i);
        }
        char str2[] = str.clone();

        for(int i =0; i<str2.length;i++) {
            if(8<=i) {
                str2[i] = '*';
            }
            System.out.print(str2[i]);
        }
    }
}
