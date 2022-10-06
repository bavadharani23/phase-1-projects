package com.main;

import com.bean.Account;
import com.service.AccountService;

public class App {
	public static void main(String[] args) {
		AccountService as=new AccountService();
		Account acc=new Account();
		acc.setAccno(1);
		acc.setName("raj");
		acc.setAmount(500);
		String result=as.createAccount(acc);
		System.out.println(result);
		
		Account acc1=new Account();
		acc1.setAccno(1);
		acc1.setName("raj");
		acc1.setAmount(500);
		String result1=as.createAccount(acc1);
		System.out.println(result1);
		
		 Account searchAccountDetails=as.findAccount(1);
		 if(searchAccountDetails==null)
		 {
			 System.out.println("Account details not present");
		 }
		 else
		 {
			 System.out.println(searchAccountDetails);
		 }
;
		}

}
