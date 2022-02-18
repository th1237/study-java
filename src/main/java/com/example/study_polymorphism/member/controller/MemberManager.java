package com.example.study_polymorphism.member.controller;

import com.example.study_polymorphism.member.model.vo.Member;

public class MemberManager {
    public static final int MAX_MEMBER = 40;
    private Member[] memberArr = new Member[MAX_MEMBER];
    private int memberIndex = 0;

    //다형성
    public void insertMember(Member m){
        this.memberArr[memberIndex++] = m;
    }

    public void printData() {
        System.out.println("-----------정보출력-------------");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
        for(int i = 0; i < memberIndex; i++){
            Member m = memberArr[i];
            System.out.printf("%-15s %-15s %-15d %-15.2f\n",
                    m.getName(),
                    m.getGrade(),
                    m.getPoint(),
                    m.getEjapoint());
        }
    }

}
