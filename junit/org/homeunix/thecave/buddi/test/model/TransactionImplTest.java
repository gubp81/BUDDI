package org.homeunix.thecave.buddi.model.impl;

import java.text.DateFormat;
import java.util.Date;
import ca.digitalcave.moss.collections.SortedArrayList;
import ca.digitalcave.moss.collections.CaseInsensitiveHashMap;
import java.util.List;
import java.util.Map;
import org.homeunix.thecave.buddi.model.Document;
import org.homeunix.thecave.buddi.model.ModelObject;
import org.homeunix.thecave.buddi.model.Source;
import org.homeunix.thecave.buddi.model.Transaction;
import org.homeunix.thecave.buddi.model.TransactionSplit;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TransactionImplTest</code> contains tests for the class <code>{@link TransactionImpl}</code>.
 *
 * @generatedBy CodePro at 4/5/14 9:29 PM
 * @author gpereira
 * @version $Revision: 1.0 $
 */
public class TransactionImplTest {
	/**
	 * Run the TransactionImpl() constructor test.
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testTransactionImpl_1()
		throws Exception {
		TransactionImpl result = new TransactionImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the long getAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetAmount_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		long result = fixture.getAmount();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long getBalance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String sourceUid = "";

		long result = fixture.getBalance(sourceUid);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getBalance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetBalance_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String sourceUid = "";

		long result = fixture.getBalance(sourceUid);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Date getDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		Date result = fixture.getDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(0L)), DateFormat.getInstance().format(result));
		assertEquals(0L, result.getTime());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Source getFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetFrom_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		Source result = fixture.getFrom();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(false, result.isDeleted());
		assertEquals(null, result.getNotes());
		assertEquals(null, result.getModified());
		assertEquals(null, result.getDocument());
//		assertEquals("1b897c27-c5a5-407a-b234-a066cb8c8d8e", result.getUid());
	}

	/**
	 * Run the List<TransactionSplit> getFromSplits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetFromSplits_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		List<TransactionSplit> result = fixture.getFromSplits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getMemo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetMemo_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		String result = fixture.getMemo();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		String result = fixture.getNumber();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Source getTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetTo_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		Source result = fixture.getTo();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(false, result.isDeleted());
		assertEquals(null, result.getNotes());
		assertEquals(null, result.getModified());
		assertEquals(null, result.getDocument());
//		assertEquals("7fa1cdcf-5e68-484e-8357-fc63659e8434", result.getUid());
	}

	/**
	 * Run the List<TransactionSplit> getToSplits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testGetToSplits_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		List<TransactionSplit> result = fixture.getToSplits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean isClearedFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsClearedFrom_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isClearedFrom();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClearedFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsClearedFrom_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(false);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isClearedFrom();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isClearedTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsClearedTo_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isClearedTo();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClearedTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsClearedTo_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(false);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isClearedTo();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDeleted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsDeleted_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isDeleted();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeleted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsDeleted_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(false);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isDeleted();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInflow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsInflow_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isInflow();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInflow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsInflow_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(-1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isInflow();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInflow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsInflow_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(-1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isInflow();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInflow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsInflow_4()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isInflow();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInflow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsInflow_5()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isInflow();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isReconciledFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsReconciledFrom_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isReconciledFrom();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isReconciledFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsReconciledFrom_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(false);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isReconciledFrom();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isReconciledTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsReconciledTo_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isReconciledTo();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isReconciledTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsReconciledTo_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(false);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isReconciledTo();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isScheduled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsScheduled_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isScheduled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isScheduled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testIsScheduled_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(false);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		boolean result = fixture.isScheduled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAmount(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetAmount_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		long amount = 1L;

		fixture.setAmount(amount);

		// add additional test code here
	}

	/**
	 * Run the void setAmount(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetAmount_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		long amount = 1L;

		fixture.setAmount(amount);

		// add additional test code here
	}

	/**
	 * Run the void setBalance(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetBalance_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String sourceUid = "";
		long balance = 1L;

		fixture.setBalance(sourceUid, balance);

		// add additional test code here
	}

	/**
	 * Run the void setClearedTo(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetClearedTo_10()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom((Source) null);
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		boolean cleared = true;

		fixture.setClearedTo(cleared);

		// add additional test code here
	}

	/**
	 * Run the void setDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDate_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Date date = new Date();

		fixture.setDate(date);

		// add additional test code here
	}

	/**
	 * Run the void setDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDate_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = null;
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Date date = new Date();

		fixture.setDate(date);

		// add additional test code here
	}

	/**
	 * Run the void setDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDate_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Date date = new Date();

		fixture.setDate(date);

		// add additional test code here
	}

	/**
	 * Run the void setDeleted(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDeleted_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		boolean deleted = true;

		fixture.setDeleted(deleted);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDescription_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription((String) null);
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetDescription_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setFrom(Source) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFrom_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = null;
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Source from = new AccountImpl();

		fixture.setFrom(from);

		// add additional test code here
	}

	/**
	 * Run the void setFrom(Source) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFrom_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Source from = new AccountImpl();

		fixture.setFrom(from);

		// add additional test code here
	}

	/**
	 * Run the void setFromSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFromSplits_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = new SortedArrayList();

		fixture.setFromSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setFromSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFromSplits_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = null;
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = new SortedArrayList();

		fixture.setFromSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setFromSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFromSplits_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = new SortedArrayList();

		fixture.setFromSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setFromSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFromSplits_4()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = null;
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = null;

		fixture.setFromSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setFromSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetFromSplits_5()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = null;

		fixture.setFromSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setMemo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetMemo_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String memo = "";

		fixture.setMemo(memo);

		// add additional test code here
	}

	/**
	 * Run the void setMemo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetMemo_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo((String) null);
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String memo = "";

		fixture.setMemo(memo);

		// add additional test code here
	}

	/**
	 * Run the void setMemo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetMemo_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String memo = "";

		fixture.setMemo(memo);

		// add additional test code here
	}

	/**
	 * Run the void setNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetNumber_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String number = "";

		fixture.setNumber(number);

		// add additional test code here
	}

	/**
	 * Run the void setNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetNumber_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber((String) null);
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String number = "";

		fixture.setNumber(number);

		// add additional test code here
	}

	/**
	 * Run the void setNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetNumber_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		String number = "";

		fixture.setNumber(number);

		// add additional test code here
	}

	/**
	 * Run the void setScheduled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetScheduled_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		boolean scheduled = true;

		fixture.setScheduled(scheduled);

		// add additional test code here
	}

	/**
	 * Run the void setTo(Source) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetTo_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = null;
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Source to = new AccountImpl();

		fixture.setTo(to);

		// add additional test code here
	}

	/**
	 * Run the void setTo(Source) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetTo_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		Source to = new AccountImpl();

		fixture.setTo(to);

		// add additional test code here
	}

	/**
	 * Run the void setToSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetToSplits_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = new SortedArrayList();

		fixture.setToSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setToSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetToSplits_2()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = null;
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = new SortedArrayList();

		fixture.setToSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setToSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetToSplits_3()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = new SortedArrayList();

		fixture.setToSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setToSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetToSplits_4()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = null;
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = null;

		fixture.setToSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the void setToSplits(List<TransactionSplit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testSetToSplits_5()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();
		List<TransactionSplit> splits = null;

		fixture.setToSplits(splits);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TransactionImpl fixture = new TransactionImpl();
		fixture.setFrom(new AccountImpl());
		fixture.setScheduled(true);
		fixture.setNumber("");
		fixture.setClearedFrom(true);
		fixture.setClearedTo(true);
		fixture.setMemo("");
		fixture.setReconciledFrom(true);
		fixture.setDescription("");
		fixture.setAmount(1L);
		fixture.setDeleted(true);
		fixture.setReconciledTo(true);
		fixture.setTo(new AccountImpl());
		fixture.toSplits = new SortedArrayList();
		fixture.date = new Day();
		fixture.fromSplits = new SortedArrayList();
		fixture.uid = "";
		fixture.modifiedTime = new Time();
		fixture.document = new DocumentImpl();

		String result = fixture.toString();

		// add additional test code here
//		assertEquals(" 1 (null (18a5c0fb-680d-4968-bceb-df0dfc03631f) -> null (19508ba9-2c65-4306-b26f-61fd87df9d0a))", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/5/14 9:29 PM
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
	 * @generatedBy CodePro at 4/5/14 9:29 PM
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
	 * @generatedBy CodePro at 4/5/14 9:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TransactionImplTest.class);
	}
}