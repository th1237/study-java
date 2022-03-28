package com.homework.test.workshop;

public class Test03 {
    public static void main(String[] args) {
        Company com = new Company(Integer.parseInt(args[0]));
        System.out.printf("�� �⺻�� �� : %.1f  ���� : %.1f\n",com.getIncome(),com.getAfterTaxIncome());
        System.out.printf("�� ���ʽ� �� : %.1f  ���� : %.1f\n",com.getBonus(),com.getAfterTaxBonus());
        System.out.printf("�� ���޾� �� : %.1f\n",com.getAfterTaxIncome()+com.getAfterTaxBonus());
    }
}
