package com.homework.test.net.run;

import com.homework.test.net.member.model.Member;

public class Run {

    public static void main(String[] args) {
        Member M1 = new Member();
        M1.setMemberId("private123");
        M1.setMemberPwd("0123");
        M1.setMemberName("안태현");
        M1.setAge(28);
        M1.setGender('남');
        M1.setPhone("010-0707-8282");
        M1.setEmail("private123@naver.com");

        System.out.println("**********Account info**********");
        System.out.printf("ID : %s%n", M1.getMemberId());
        System.out.printf("PW : %s%n", M1.getMemberPwd());
        System.out.printf("이름 : %s%n", M1.getMemberName());
        System.out.printf("나이 : %d%n", M1.getAge());
        System.out.printf("성별 : %c자%n", M1.getGender());
        System.out.printf("전화번호 : %s%n", M1.getPhone());
        System.out.printf("Email : %s%n", M1.getEmail());

    }
}
