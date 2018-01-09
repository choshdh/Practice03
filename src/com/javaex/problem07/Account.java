package com.javaex.problem07;

public class Account {

    
	private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
		// TODO Auto-generated constructor stub
    	this.accountNo = accountNo;
	}
    
    //필요한 메소드 작성
	public void deposit(int money) {
		// TODO Auto-generated method stub
		balance += money;
		
	}

	public void withdraw(int money) {
		// TODO Auto-generated method stub
		if(balance>money) {
			balance -= money;
		}else {
			System.out.println("예금액보다 출금액이 많아 출금 할 수 없습니다.");
		}
		
	}

	public void showBalance() {
		// TODO Auto-generated method stub
		System.out.println("현재 잔고는 : " + balance);
	}
}
