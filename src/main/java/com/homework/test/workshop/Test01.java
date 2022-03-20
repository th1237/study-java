package com.homework.test.workshop;

public class Test01 {

    public static void main(String[] args) {

        if(args.length != 3) {
            System.out.println("정수 3개를 입력해주세요.");
            return;
        }

        System.out.print("입력값 : ");
        for(int i = 0; i < args.length; i++) {
            if(Integer.parseInt(args[i]) > 9 || Integer.parseInt(args[i]) < 1) {
                System.out.println("입력 가능한 정수 범위는 1~9 입니다.");
                break;
            }
            System.out.print(args[i] + " ");
        }
        System.out.println();


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < args.length; i++) {
            if(Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
            if(Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.printf("최대값 : %d%n최소값 : %d",max,min);

    }

}
