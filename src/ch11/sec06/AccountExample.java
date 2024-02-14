package ch11.sec06;

import javax.naming.InsufficientResourcesException;

public class AccountExample {

	public static void main(String[] args) {
		Account a = new Account();
		
		// 예금하기
		a.deposit(10000);
		System.out.println("예금액: " + a.getBalance());
		
		// 출금하기
		try {
			a.withdraw(30000);
			
		} catch (InsufficientResourcesException e) {
			String message = e.getMessage();
			System.out.println(message);
			
		}
		
	}

}
