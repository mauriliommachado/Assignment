/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maurilio.backbase.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.ArrayList;
import java.util.List;
import com.maurilio.backbase.model.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClientRestController {

    private static final String REST_URI
            = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions";

    private final Client client = Client.create();

    public List<Transaction> getAccountTransactions() {
        WebResource webResource = client.resource(REST_URI);
        JSONObject jsonO = new JSONObject(webResource.get(String.class));
        JSONArray arrayTransactions = jsonO.getJSONArray("transactions");
        ArrayList<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < arrayTransactions.length(); i++) {
            JSONObject json = arrayTransactions.getJSONObject(i);
            Transaction transaction = new Transaction(json.getString("id"),
                    json.getJSONObject("this_account").getString("id"),
                    json.getJSONObject("other_account").optString("number"),
                    json.getJSONObject("other_account").getJSONObject("holder").getString("name"),
                    json.getJSONObject("other_account").getJSONObject("metadata").optString("image_URL"),
                    json.getJSONObject("details").getJSONObject("value").getDouble("amount"),
                    json.getJSONObject("details").getJSONObject("value").getString("currency"),
                    json.getJSONObject("details").getJSONObject("value").getDouble("amount"),
                    json.getJSONObject("details").getJSONObject("value").getString("currency"),
                    json.getJSONObject("details").optString("type"),
                    json.getJSONObject("details").optString("description"));
            transactions.add(transaction);
        }
        return transactions;
    }

}
