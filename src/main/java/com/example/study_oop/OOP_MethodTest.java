package com.example.study_oop;

public class OOP_MethodTest {

        int a = 100;
        static int s = 99;

        public static void main(String[] args) {
            OOP_MethodTest t = new OOP_MethodTest();
            t.test1();
            //100
            //99

            t.test2();
            //100

            OOP_MethodTest t3 = new OOP_MethodTest();
            t.test3(t3); //10
            System.out.println(t3.a);
            //10
            System.out.println(t.a);
            //200


            t.test4(t);
            //1000
            System.out.println(t.a);
            //1000



        }

        public void test1() {
            int a = 1000;
            int s = 999;
            System.out.println(this.a);
            //100
            System.out.println(OOP_MethodTest.s);
            //99
        }

        public void test2() {
            OOP_MethodTest t = new OOP_MethodTest();
            t.a = 1000;
            System.out.println(a);
            //100
        }
        public void test3(OOP_MethodTest t) {
            t.a = 10;
            this.a = 200;
            System.out.println(t.a);
            //10
        }
        public void test4(OOP_MethodTest t) {
            t.a = 1000;
            System.out.println(this.a);
        }

    }

