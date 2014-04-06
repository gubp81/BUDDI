package org.homeunix.thecave.buddi.model.impl;

import java.util.Date;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;
import org.homeunix.thecave.buddi.model.Transaction;




public abstract class TransactionListStrategy  
{

	public abstract boolean transactionFilterLastYear(Transaction t, Date today);
	public abstract boolean transactionFilterThisYear(Transaction t, Date today);


}