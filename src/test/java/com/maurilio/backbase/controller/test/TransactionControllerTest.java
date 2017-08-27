
package com.maurilio.backbase.controller.test;

import com.maurilio.backbase.controller.TransactionController;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionControllerTest {

    TransactionController tc;

    public TransactionControllerTest() {
        tc = new TransactionController();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void contruct() {
        assertNotNull(tc);
    }

    @Test
    public void transactionsTest() {
        assertTrue(tc.transactions().size() > 0);
    }
    
    @Test
    public void transactionsFilteredTestEmpty() {
        assertTrue(tc.transactions("no-result").isEmpty());
    }
    
    //I could use mockito to mock the WS call, but as you said, i didnt want to over engineer it.
    @Test
    public void transactionsFilteredTest() {
        assertTrue(!tc.transactions("sandbox-payment").isEmpty());
    }
    
    @Test
    public void transactionsFilteredSumTest() {
        assertEquals(73.76 , new JSONObject(tc.transactionsSum("sandbox-payment")).getDouble("total"),1);
    }
}
