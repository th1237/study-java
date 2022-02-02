package com.example.study_array;

import java.util.Scanner;

public class ArrayTest3 {

        public static void main(String[] args) {
            ArrayTest3 t3 = new ArrayTest3();
            t3.test();
        }
        public void test() {
            Scanner sc = new Scanner(System.in);
            System.out.print("문자열을 입력하세요 >> ");
            String inputStr = sc.next();

            System.out.print("검색할 문자를 입력하세요 >> ");
            char inputChar = sc.next().charAt(0);

            char[] str = new char[inputStr.length()];

            int count = 0;

            for(int i = 0; i < inputStr.length(); i++) {
                str[i] = inputStr.charAt(i);
                if(str[i] == inputChar) {
                    count += 1;
                }
            }

            System.out.printf("출력 : 입력하신 문자열 %s에서 찾으시는 문자 %c는 %d개 입니다."
                    ,inputStr, inputChar, count);



        }

    }
