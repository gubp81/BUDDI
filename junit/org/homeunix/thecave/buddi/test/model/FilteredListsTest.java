package org.homeunix.thecave.buddi.model.impl;

import java.util.List;
import org.homeunix.thecave.buddi.model.Document;
import org.homeunix.thecave.buddi.model.Source;
import org.homeunix.thecave.buddi.model.Transaction;
import org.junit.*;
import ca.digitalcave.moss.collections.SortedArrayList;
import static org.junit.Assert.*;

/**
 * The class <code>FilteredListsTest</code> contains tests for the class <code>{@link FilteredLists}</code>.
 *
 * @generatedBy CodePro at 4/5/14 7:19 PM
 * @author gpereira
 * @version $Revision: 1.0 $
 */
public class FilteredListsTest {
	/**
	 * Run the List<Transaction> getTransactionsBySearch(Document,Source,List<Transaction>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/14 7:19 PM
	 */
	@Test
	public void testGetTransactionsBySearch_1()
		throws Exception {
		Document model = new DocumentImpl();
		Source associatedSource = new AccountImpl();
		List<Transaction> transactions = new SortedArrayList();

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
	 * @generatedBy CodePro at 4/5/14 7:19 PM
	 */
	@Test
	public void testGetTransactionsBySearch_2()
		throws Exception {
		Document model = new DocumentImpl();
		Source associatedSource = null;
		List<Transaction> transactions = new SortedArrayList();

		List<Transaction> result = FilteredLists.getTransactionsBySearch(model, associatedSource, transactions);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/5/14 7:19 PM
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
	 * @generatedBy CodePro at 4/5/14 7:19 PM
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
	 * @generatedBy CodePro at 4/5/14 7:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FilteredListsTest.class);
	}
}