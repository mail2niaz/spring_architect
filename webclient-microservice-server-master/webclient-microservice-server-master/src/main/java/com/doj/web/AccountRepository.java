/**
 * 
 */
package com.doj.web;

import java.util.List;

import com.doj.ms.accounts.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
