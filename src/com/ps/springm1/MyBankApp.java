package com.ps.springm1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
	public static void main(String[] args) {
		//Account account=new SavingAccount();
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account=context.getBean("myAccount",Account.class);
//		Account account2=context.getBean("myAccount",Account.class);
		
//		boolean isSame= (account1==account2);
//		System.out.println(isSame);
//		System.out.println("Account1 Hashcode: "+account1.hashCode());
//		System.out.println("Account2 Hashcode: "+account2.hashCode());
		
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		
		context.close();
	}

}
