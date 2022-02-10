package com.example.study_oop;

import java.util.Arrays;
import java.util.Random;

public class OOP_NonstaticTest {

    public static void main(String[] args) {

        OOP_NonstaticTest run = new OOP_NonstaticTest();

        run.printLottoNumbers();
        run.outputChar(4, 'n');
        System.out.println("\n" + run.alphabet());
        System.out.println(run.mySubstring("ILoveYou", 2, 4));

    }

    //1.실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드

    public void printLottoNumbers() {
        int[] lotto = new int[6];

        int i = 0;
        outer :
        while(true) {
            Random rnd = new Random();
            int n = rnd.nextInt(45) + 1;
            lotto[i] = n;

            int j = 1;
            while(j < i) {
                if(lotto[i] == lotto[j]) {
                    continue outer;
                }
                else j++;

            }
            i++;
            if(i == lotto.length)
                break;
        }

        for(i = 0; i < lotto.length - 1; i++) {
            int min = i;
            for(int j = i; j < lotto.length; j++) {
                if(lotto[min] > lotto[j]) {
                    min = j;
                }
            }
            int temp = lotto[min];
            lotto[min] = lotto[i];
            lotto[i] = temp;
        }

        System.out.println(Arrays.toString(lotto));
    }

    //2.실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드

    public void outputChar(int num, char ch) {
        for(int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }

    //3.실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드

    public char alphabet() {
        char n = (char) ((Math.random() * 26) + 65);
        return n;
    }

    //4.실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을 추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리

    public String mySubstring(String s, int a, int b) {

        if(s==null)
            return null;

        String str = "";
        for(int i = a; i <= b; i++) {
            str += s.charAt(i);
        }
        return str;
    }
}
