package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar = 100;
        double won = 1000000;
        
        CConverter.setRate(1118.70);
        
        
        //백만원을 달러로 출력
        System.out.println("백만원은 : " + CConverter.toDoller(won) + " 달러 입니다.");
        
        //100달려를 원으로 출력
        System.out.println("백달러는 : " + CConverter.toKWR(dollar) + " 입니다.");
        
    }

}
