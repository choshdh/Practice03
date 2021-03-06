package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        // 친구정보 입력받기
        for(int i=0; i<3; i++) {
        	String friendInfo = sc.nextLine();
        	// 입력받은 친구정보를 공백을 구분자로 사용 분리하여 배열로 생성하여 friend 에 대입
        	String[] friend = friendInfo.split(" ");
        	// Friend 객체 생성하여 데이터 넣기
        	Friend f = new Friend();
        	f.setName(friend[0]);
        	f.setHp(friend[1]);
        	f.setSchool(friend[2]);
        	// 배열에 추가하기
        	friendArray[i] = f;
        }
 
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
