package org.homeunix.thecave.buddi.test.model;

import java.util.List;
import org.homeunix.thecave.buddi.model.Document;
import org.homeunix.thecave.buddi.model.Source;
import org.homeunix.thecave.buddi.model.Transaction;
import org.homeunix.thecave.buddi.model.impl.AccountImpl;
import org.homeunix.thecave.buddi.model.impl.DocumentImpl;
import ca.digitalcave.moss.collections.ListChangeWrapper;
import org.homeunix.thecave.buddi.model.impl.FilteredLists;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FilteredListsTest</code> contains tests for the class <code>{@link FilteredLists}</code>.
 *
 * @generatedBy CodePro at 4/7/14 12:04 AM
 * @author gpereira
 * @version $Revision: 1.0 $
 */
public class FilteredListsTest {
	/**
	 * Run the List<Transaction> getTransactionsBySearch(Document,Source,List<Transaction>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/7/14 12:04 AM
	 */
	@Test
	public void testGetTransactionsBySearch_1()
		throws Exception {
		Document model = new DocumentImpl();
		Source associatedSource = new AccountImpl();
		List<Transaction> transactions = new ListChangeWrapper();

		List<Transaction> result = FilteredLists.getTransactionsBySearch(model, associatedSource, transactions);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Transaction> getTransactionsBySearch(Document,Source,List<Transaction>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/7/14 12:04 AM
	 */
	@Test
	public void testGetTransactionsBySearch_2()
		throws Exception {
		Document model = new DocumentImpl();
		Source associatedSource = null;
		List<Transaction> transactions = new ListChangeWrapper();

		List<Transaction> result = FilteredLists.getTransactionsBySearch(model, associatedSource, transactions);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/7/14 12:04 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FilteredListsTest.class);
	}
}