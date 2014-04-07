/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.thecave.buddi.test.model;


import java.util.Date;
import ca.digitalcave.moss.collections.CaseInsensitiveHashMap;
import java.util.List;
import java.util.Map;
import org.homeunix.thecave.buddi.model.BudgetCategory;
import org.homeunix.thecave.buddi.model.BudgetCategoryType;
import org.homeunix.thecave.buddi.model.Document;
import org.homeunix.thecave.buddi.model.ModelObject;
import org.homeunix.thecave.buddi.model.impl.BudgetCategoryImpl;
import org.homeunix.thecave.buddi.model.impl.BudgetCategoryTypeMonthly;
import org.homeunix.thecave.buddi.model.impl.DocumentImpl;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BudgetCategoryImplTest</code> contains tests for the class <code>{@link BudgetCategoryImpl}</code>.
 *
 * @generatedBy CodePro at 4/5/14 7:38 PM
 * @author nikita
 * @version $Revision: 1.0 $
 */
public class BudgetCategoryImplTest {
	/**
	 * Run the BudgetCategory clone(Map<ModelObject,ModelObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	
	/**
	 * Run the int compareTo(ModelObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		ModelObject arg0 = new BudgetCategoryImpl();

		int result = fixture.compareTo(arg0);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int compareTo(ModelObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
	fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		ModelObject arg0 = new BudgetCategoryImpl();

		int result = fixture.compareTo(arg0);

		// add additional test code here
		assertEquals(-1, result);
	}



	/**
	 * Run the List<BudgetCategory> getAllChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAllChildren_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<BudgetCategory> result = fixture.getAllChildren();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BudgetCategory> getAllChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAllChildren_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<BudgetCategory> result = fixture.getAllChildren();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the long getAmount(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date periodDate = new Date();

		long result = fixture.getAmount(periodDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAmount(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date periodDate = new Date();

		long result = fixture.getAmount(periodDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAmount(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_3()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		long result = fixture.getAmount(startDate, endDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAmount(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_4()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		long result = fixture.getAmount(startDate, endDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAmount(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_5()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		long result = fixture.getAmount(startDate, endDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAmount(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_6()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		long result = fixture.getAmount(startDate, endDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAmount(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmount_7()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		long result = fixture.getAmount(startDate, endDate);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Map<String, Long> getAmounts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmounts_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(null);
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		Map<String, Long> result = fixture.getAmounts();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, Long> getAmounts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetAmounts_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		Map<String, Long> result = fixture.getAmounts();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the BudgetCategoryType getBudgetPeriodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetPeriodType_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType((BudgetCategoryType) null);
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		BudgetCategoryType result = fixture.getBudgetPeriodType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BUDGET_CATEGORY_TYPE_MONTH", result.toString());
		assertEquals("BUDGET_CATEGORY_TYPE_MONTH", result.getName());
		assertEquals("MONTH", result.getKey());
		assertEquals("MMM yyyy", result.getDateFormat());
	}

	/**
	 * Run the BudgetCategoryType getBudgetPeriodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetPeriodType_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		BudgetCategoryType result = fixture.getBudgetPeriodType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BUDGET_CATEGORY_TYPE_MONTH", result.toString());
		assertEquals("BUDGET_CATEGORY_TYPE_MONTH", result.getName());
		assertEquals("MONTH", result.getKey());
		assertEquals("MMM yyyy", result.getDateFormat());
	}

	/**
	 * Run the List<String> getBudgetPeriods(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetPeriods_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		List<String> result = fixture.getBudgetPeriods(startDate, endDate);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("BUDGET_CATEGORY_TYPE_MONTH:2014:3:1"));
	}

	/**
	 * Run the List<String> getBudgetPeriods(Date,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetPeriods_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date startDate = new Date();
		Date endDate = new Date();

		List<String> result = fixture.getBudgetPeriods(startDate, endDate);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("BUDGET_CATEGORY_TYPE_MONTH:2014:3:1"));
	}

	/**
	 * Run the List<Date> getBudgetedDates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetedDates_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<Date> result = fixture.getBudgetedDates();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Date> getBudgetedDates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetedDates_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<Date> result = fixture.getBudgetedDates();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Date> getBudgetedDates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetedDates_3()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<Date> result = fixture.getBudgetedDates();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Date> getBudgetedDates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetBudgetedDates_4()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<Date> result = fixture.getBudgetedDates();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BudgetCategory> getChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetChildren_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<BudgetCategory> result = fixture.getChildren();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BudgetCategory> getChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetChildren_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		List<BudgetCategory> result = fixture.getChildren();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_3()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_4()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_5()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_6()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent((BudgetCategory) null);
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetFullName_7()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}


	/**
	 * Run the BudgetCategoryType getPeriodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testGetPeriodType_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		BudgetCategoryType result = fixture.getPeriodType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BUDGET_CATEGORY_TYPE_MONTH", result.toString());
		assertEquals("BUDGET_CATEGORY_TYPE_MONTH", result.getName());
		assertEquals("MONTH", result.getKey());
		assertEquals("MMM yyyy", result.getDateFormat());
	}

	/**
	 * Run the boolean isExpanded() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testIsExpanded_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		boolean result = fixture.isExpanded();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isExpanded() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testIsExpanded_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(false);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		boolean result = fixture.isExpanded();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIncome() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testIsIncome_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		boolean result = fixture.isIncome();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIncome() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testIsIncome_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(false);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");

		boolean result = fixture.isIncome();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAmount(Date,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetAmount_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date periodDate = new Date();
		long amount = 1L;

		fixture.setAmount(periodDate, amount);

		// add additional test code here
	}

	/**
	 * Run the void setAmount(Date,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetAmount_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Date periodDate = new Date();
		long amount = 1L;

		fixture.setAmount(periodDate, amount);

		// add additional test code here
	}

	/**
	 * Run the void setAmounts(Map<String,Long>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetAmounts_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		Map<String, Long> amounts = new CaseInsensitiveHashMap();

		fixture.setAmounts(amounts);

		// add additional test code here
	}

	/**
	 * Run the void setDeleted(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetDeleted_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		boolean deleted = false;

		fixture.setDeleted(deleted);

		// add additional test code here
	}

	/**
	 * Run the void setDeleted(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetDeleted_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		boolean deleted = true;

		fixture.setDeleted(deleted);

		// add additional test code here
	}

	/**
	 * Run the void setDeleted(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetDeleted_3()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		boolean deleted = true;

		fixture.setDeleted(deleted);

		// add additional test code here
	}

	/**
	 * Run the void setDeleted(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetDeleted_4()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		boolean deleted = true;

		fixture.setDeleted(deleted);

		// add additional test code here
	}

	/**
	 * Run the void setExpanded(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetExpanded_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		boolean expanded = true;

		fixture.setExpanded(expanded);

		// add additional test code here
	}

	/**
	 * Run the void setIncome(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetIncome_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		boolean income = true;

		fixture.setIncome(income);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetName_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setParent(BudgetCategory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetParent_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		BudgetCategoryImpl parent = new BudgetCategoryImpl();
		parent.setIncome(true);
		parent.setExpanded(true);
		parent.setParent(new BudgetCategoryImpl());
		parent.setPeriodType(new BudgetCategoryTypeMonthly());
		parent.setAmounts(new CaseInsensitiveHashMap());
		parent.setName("") ;
		parent.setDocument(new DocumentImpl()) ;
		parent.setDeleted(true) ;
		parent.setUid("");
		parent.setNotes("");

		fixture.setParent(parent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(BudgetCategory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetParent_2()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		BudgetCategoryImpl parent = new BudgetCategoryImpl();
		parent.setIncome(true);
		parent.setExpanded(true);
		parent.setParent(new BudgetCategoryImpl());
		parent.setPeriodType(new BudgetCategoryTypeMonthly());
		parent.setAmounts(new CaseInsensitiveHashMap());
		parent.setName("") ;
		parent.setDocument(new DocumentImpl()) ;
		parent.setDeleted(true) ;
		parent.setUid("");
		parent.setNotes("");

		fixture.setParent(parent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(BudgetCategory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetParent_3()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
                
		BudgetCategory parent = new BudgetCategoryImpl();

		fixture.setParent(parent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(BudgetCategory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetParent_4()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
		BudgetCategory parent = new BudgetCategoryImpl();

		fixture.setParent(parent);

		// add additional test code here
	}

	/**
	 * Run the void setPeriodType(BudgetCategoryType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Test
	public void testSetPeriodType_1()
		throws Exception {
		BudgetCategoryImpl fixture = new BudgetCategoryImpl();
		fixture.setIncome(true);
		fixture.setExpanded(true);
		fixture.setParent(new BudgetCategoryImpl());
		fixture.setPeriodType(new BudgetCategoryTypeMonthly());
		fixture.setAmounts(new CaseInsensitiveHashMap());
		fixture.setName("") ;
		fixture.setDocument(new DocumentImpl()) ;
		fixture.setDeleted(true) ;
		fixture.setUid("");
		fixture.setNotes("");
               
		BudgetCategoryType periodType = new BudgetCategoryTypeMonthly();

		fixture.setPeriodType(periodType);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/5/14 7:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BudgetCategoryImplTest.class);
	}
}