package com.example.study_polymorphism.member.model.vo;

public class Ruby extends Member{
    public Ruby (){}

    public Ruby(String name, String grade, int point){
        super(name, grade, point);
    }

    @Override
    public double getEjapoint(){
        return super.getPoint()*0.3;
    }

}
