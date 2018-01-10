package com.javaex.problem02;

public class Base {
    
    public void service(String state) {
        
        //코드작성
    	if(state.equals("낮")) {
    		day();
    	}else if(state.equals("밤")) {
    		night();
    	}else if(state.equals("오후")) {
    		afternoon();
    	}
    }

    //부모 메소드 오버라이드
    public void day() {
        System.out.println("낮에는 열심히 일하자");
    }

    //부모 메소드 오버라이드
    public void night() {
        System.out.println("night");
    }
    
    //현재 클래스에서 메소드 생성
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }

}
