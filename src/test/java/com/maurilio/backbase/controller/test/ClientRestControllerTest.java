/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maurilio.backbase.controller.test;

import com.maurilio.backbase.controller.ClientRestController;
import com.maurilio.backbase.model.Transaction;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauri
 */
public class ClientRestControllerTest {

    ClientRestController client;
    
    public ClientRestControllerTest() {
        client = new ClientRestController();
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
    public void construct() {
        assertNotNull(client);
    }

    //I could use mockito to mock the WS call, but as you said, i didnt want to over engineer it.
    @Test
    public void getAll() {
        List<Transaction> accountTransactions = client.getAccountTransactions();
        assertNotEquals(0, accountTransactions.size());
    }
    
}
