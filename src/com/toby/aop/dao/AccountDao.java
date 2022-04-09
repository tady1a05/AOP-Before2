package com.toby.aop.dao;

import org.springframework.stereotype.Component;
import com.toby.aop.model.*;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println("Added the fucking account");
	}
	
	public void addAccount2(Account ac) {
		System.out.println("Added the fucking accoun2t");
	}
}
