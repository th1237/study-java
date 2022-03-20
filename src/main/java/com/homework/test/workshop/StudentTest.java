package com.homework.test.workshop;

public class StudentTest {

    public static void main(String[] args) {
        Student studentArray[] = new Student[3];

        studentArray[0] = new Student("홍길동", 15, 170, 80);
        studentArray[1] = new Student("한사람", 13, 180, 70);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

        for(int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i].studentInfo());
        }

        double sumAge = 0;
        double sumHeight = 0;
        double sumWeight = 0;

        for(int i = 0; i < studentArray.length; i++) {
            sumAge += studentArray[i].getAge();
            sumHeight += studentArray[i].getHeight();
            sumWeight += studentArray[i].getWeight();
        }

        System.out.println();
        System.out.printf("나이 평균 : %.3f세%n", sumAge / studentArray.length);
        System.out.printf("신장 평균 : %.3fcm%n", sumHeight / studentArray.length);
        System.out.printf("몸무게 평균 : %.3fkg%n", sumWeight / studentArray.length);
        System.out.println();


        int minAge = 0;
        int maxAge = 0;
        int minHeight = 0;
        int maxHeight = 0;
        int minWeight = 0;
        int maxWeight = 0;
        for(int i = 0; i < studentArray.length; i++) {
            if(studentArray[minAge].getAge() > studentArray[i].getAge()) minAge = i;
            if(studentArray[maxAge].getAge() < studentArray[i].getAge()) maxAge = i;
            if(studentArray[minHeight].getHeight() > studentArray[i].getHeight()) minHeight = i;
            if(studentArray[maxHeight].getHeight() < studentArray[i].getHeight()) maxHeight = i;
            if(studentArray[minWeight].getWeight() > studentArray[i].getWeight()) minWeight = i;
            if(studentArray[maxWeight].getWeight() < studentArray[i].getWeight()) maxWeight = i;
        }

        System.out.printf("나이가 가장 많은 학생 : %s%n"
                        + "나이가 가장 적은 학생 : %s%n"
                        + "신장이 가장 큰 학생 : %s%n"
                        + "신장이 가장 작은 학생 : %s%n"
                        + "몸무게가 가장 많이 나가는 학생 : %s%n"
                        + "몸무게가 가장 적게 나가는 학생 : %d",
                studentArray[maxAge].getName(),
                studentArray[minAge].getName(),
                studentArray[maxHeight].getName(),
                studentArray[minHeight].getName(),
                studentArray[maxWeight].getName(),
                studentArray[minWeight].getWeight());


    }
}
