package kr.hs.dgsw.java;

public class Person {
    String name = "홍길동";
    int age = 0;
    double height = 0.0;

    void getAge(){
        age++;
        height+=6.0;
    }

    void PersonInfo(){
        System.out.printf("%s님의 나이는 %d이고 키는 %.1f 입니다.",name,age,height);
    }
}
