package com.example.study_array;

import java.util.Scanner;

public class ArrayTest6 {

    public static void main(String[] args) {
        ArrayTest6 t6 = new ArrayTest6();
        t6.test();
    }

    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 하나 입력하세요 :  ");
        int num =sc.nextInt();

        int arr[] = new int[num];
        System.out.print("[");
        for(int i=0; i<num;i++) {
            arr[i] = i+1;
            if(i>(num/2)) {
                arr[i]=arr[(num-1)-i];
            }
            System.out.print(arr[i]);
            if(i != (num-1)) {
                System.out.print(", "+" ");
            }
        }System.out.println("]");
    }
}
