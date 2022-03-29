package com.homework.test.workshop;

public class MobileTest {
    public static void main(String[] args) {
        MobileTest smp = new MobileTest();
        Mobile lTab = new Ltab("Ltab",500,"AP-01");
        Mobile oTab = new Otab("Otab",1000,"AND-20");

        smp.printSaperator(lTab, oTab);

        lTab.charge(10);
        oTab.charge(10);
        System.out.println("\n\n10�� ����");
        smp.printSaperator(lTab, oTab);

        lTab.opertate(5);
        oTab.opertate(5);
        System.out.println("\n\n5�� ��ȭ");
        smp.printSaperator(lTab, oTab);

    }
    public void printSaperator(Mobile a, Mobile b){
        System.out.println("   Mobile     Battery\t  OS");
        System.out.println("------------------------------------------");
        System.out.println(a+"\n"+b);
    }
}
