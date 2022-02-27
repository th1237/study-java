package com.homework.test.oop.employee.controller;

import com.homework.test.oop.employee.model.vo.Employee;

public class Run {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "홍길동", '남', "010-0789-5678");
        Employee e3 = new Employee(2, "유관순", '여', "010-7897-8282", "영업부", 3000000, 0.15);

        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();

    }
}
