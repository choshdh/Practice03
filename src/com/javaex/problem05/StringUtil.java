package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
    	String total = "";
        //메소드 내용작성
        for(String s : strArray) {
        	total +=s;
        }
        return total;
    }

}
