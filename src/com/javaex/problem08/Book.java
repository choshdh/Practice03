package com.javaex.problem08;

public class Book {
    
	private int bookNo;
	private String title;
	private  String author;
    int stateCode;
    
	public Book(int bookNum, String bookName, String author) {
		super();
		this.bookNo = bookNum;
		this.title = bookName;
		this.author = author;
		this.stateCode = 1;
	}

	public void print() {
		String check;
		if(stateCode==1) {
			check = "재고있음";
		}else {
			check = "재고없음";
		}
		
		String info = "책번호 : " + bookNo + ", 책이름 : " + title + ", 책저자 : " + author + ", 대여 가능유무 : " + check;
		
		System.out.println(info);
	}
	
	public void rent() {
		if(stateCode==1) {
			this.stateCode=0;
			System.out.println(title + " 이(가) 대여 됐습니다. "); 
		}else {
			System.out.println(title + " 이(가) 이미 대여중입니다. ");
		}
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    
    
    
}
