package com.example.study_array;

import java.util.Scanner;

public class ArrayTest4 {

    public static void main(String[] args) {
        ArrayTest4 t4 = new ArrayTest4();
        t4.test1();
//		t4.test2();
    }
    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("핸드폰번호 입력(공백없이) : ");
        String phoneStr = sc.next();
        String result = " ";

        char[] phone = new char[phoneStr.length()];
        for(int i = 0; i < phoneStr.length(); i++)
            phone[i] = phoneStr.charAt(i);

        char[] outputPhone = phone.clone();

        for(int i = 3; i < 7 ; i++) {
            outputPhone[i] = '*';
        }

        for(int i = 0; i < outputPhone.length; i++)
            result += outputPhone[i];

        System.out.printf("입력하신 번호는 %s 입니다. ",result);
    }

    public void test2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("핸드폰번호 입력(공백없이) : ");
        String phoneStr = sc.next();

        String newPhoneStr = phoneStr.substring(0, 3) + "****" +
                phoneStr.substring(7, phoneStr.length());

        System.out.printf("입력하신 번호는 %s 입니다. ", newPhoneStr);
    }
}
