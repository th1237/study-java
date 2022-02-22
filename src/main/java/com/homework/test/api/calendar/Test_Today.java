package com.homework.test.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Today {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("오늘은 yyyy년 M월 dd일 E요일");
        String formattedDate = sdf.format(new Date());
        System.out.println(formattedDate);

    }

}
