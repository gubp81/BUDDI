package org.homeunix.thecave.buddi.model.impl;

import java.util.Date;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;
import org.homeunix.thecave.buddi.model.Transaction;


import ca.digitalcave.moss.common.DateUtil;

public abstract class TransactionListStrategy  {

	protected boolean transactionFilterLastYear(Transaction t, Date today) {
		return DateUtil.isSameYear(DateUtil.addYears(today, -1), t.getDate());
	}

	protected boolean transactionFilterThisYear(Transaction t, Date today) {
		return DateUtil.isSameYear(today, t.getDate());
	}

	protected boolean transactionFilterLastQuarter(Transaction t, Date today) {
		return DateUtil.isSameDay(DateUtil.getStartOfQuarter(DateUtil.addQuarters(today, -1)), DateUtil.getStartOfQuarter(t.getDate()));
	}

	protected boolean transactionFilterThisQuarter(Transaction t, Date today) {
		return DateUtil.getStartOfDay(DateUtil.getStartOfQuarter(today)).before(t.getDate());
	}

	protected boolean transactionFilterLastMonth(Transaction t, Date today) {
		return DateUtil.isSameMonth(DateUtil.addMonths(today, -1), t.getDate());
	}

	protected boolean transactionFilterThisMonth(Transaction t, Date today) {
		return DateUtil.isSameMonth(today, t.getDate());
	}

	protected boolean transactionFilterLastSemiMonth(Transaction t, BudgetCategoryType semiMonth) {
		return semiMonth.getStartOfBudgetPeriod(semiMonth.getBudgetPeriodOffset(new Date(), -1)).equals(semiMonth.getStartOfBudgetPeriod(t.getDate()));
	}

	protected boolean transactionFilterThisSemiMonth(Transaction t, BudgetCategoryType semiMonth) {
		return semiMonth.getStartOfBudgetPeriod(new Date()).equals(semiMonth.getStartOfBudgetPeriod(t.getDate()));
	}

	protected boolean transactionFilterThisWeek(Transaction t, Date today) {
		return DateUtil.isSameWeek(today, t.getDate());
	}

	protected boolean transactionFilterYesterday(Transaction t, Date today) {
		return DateUtil.isSameDay(DateUtil.addDays(today, -1), t.getDate());
	}

	protected boolean transactionFilterToday(Transaction t, Date today) {
		return DateUtil.isSameDay(today, t.getDate());
	}

}