package com.example.study_polymorphism.member.run;

import com.example.study_polymorphism.member.controller.MemberManager;
import com.example.study_polymorphism.member.model.vo.*;

public class Run {

    public static void main(String[] args) {

        MemberManager mgr = new MemberManager();
        mgr.insertMember(new Silver("홍길동", "Silver", 1000));
        mgr.insertMember(new Silver("고길동", "Silver", 2000));
        mgr.insertMember(new Silver("홍동민", "Silver", 3000));
        mgr.insertMember(new Gold("김회장", "Gold", 1000));
        mgr.insertMember(new Gold("이회장", "Gold", 2000));
        mgr.insertMember(new Gold("오회장", "Gold", 3000));
        mgr.insertMember(new Vip("이순신", "Vip", 10000));
        mgr.insertMember(new VVip("신사임당", "VVip", 100000));
        mgr.insertMember(new Ruby("세종", "Ruby", 500000));
        mgr.printData();
    }

}
