package com.homework.test.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test_CalcYourDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("태어난 년도를 입력하세요 : ");
        int year = sc.nextInt();
        System.out.print("태여난 월을 입력하세요 : ");
        int month = sc.nextInt();
        System.out.print("태어난 일을 입력하세요 : ");
        int day = sc.nextInt();

        Calendar today = Calendar.getInstance();

        Calendar birthday = new GregorianCalendar(year, month-1, day);

        long present = today.getTimeInMillis();
        long birthd = birthday.getTimeInMillis();

        double diff = ((double) present - birthd) / 1000 / 60 / 60 / 24;

        System.out.println("오늘은 태어난지 D+" + (int)(Math.floor(diff)) + "일입니다.");

    }
}
