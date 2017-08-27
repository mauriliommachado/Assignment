package com.maurilio.backbase.model;

public class Transaction {

    public Transaction(String id, String accountId, String counterPartAccount, String counterPartyName, String counterPartyLogoPath, double instructedAmount, String instructedCurrency, double transactionAmount, String transactionCurrency, String transactionType, String description) {
        this.id = id;
        this.accountId = accountId;
        this.counterPartAccount = counterPartAccount;
        this.counterPartyName = counterPartyName;
        this.counterPartyLogoPath = counterPartyLogoPath;
        this.instructedAmount = instructedAmount;
        this.instructedCurrency = instructedCurrency;
        this.transactionAmount = transactionAmount;
        this.transactionCurrency = transactionCurrency;
        this.transactionType = transactionType;
        this.description = description;
    }

    private String id;
    private String accountId;
    private String counterPartAccount;
    private String counterPartyName;
    private String counterPartyLogoPath;
    private double instructedAmount;
    private String instructedCurrency;
    private double transactionAmount;
    private String transactionCurrency;
    private String transactionType;
    private String description;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the counterPartAccount
     */
    public String getCounterPartAccount() {
        return counterPartAccount;
    }

    /**
     * @param counterPartAccount the counterPartAccount to set
     */
    public void setCounterPartAccount(String counterPartAccount) {
        this.counterPartAccount = counterPartAccount;
    }

    /**
     * @return the counterPartyName
     */
    public String getCounterPartyName() {
        return counterPartyName;
    }

    /**
     * @param counterPartyName the counterPartyName to set
     */
    public void setCounterPartyName(String counterPartyName) {
        this.counterPartyName = counterPartyName;
    }

    /**
     * @return the counterPartyLogoPath
     */
    public String getCounterPartyLogoPath() {
        return counterPartyLogoPath;
    }

    /**
     * @param counterPartyLogoPath the counterPartyLogoPath to set
     */
    public void setCounterPartyLogoPath(String counterPartyLogoPath) {
        this.counterPartyLogoPath = counterPartyLogoPath;
    }

    /**
     * @return the instructedAmount
     */
    public double getInstructedAmount() {
        return instructedAmount;
    }

    /**
     * @param instructedAmount the instructedAmount to set
     */
    public void setInstructedAmount(double instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    /**
     * @return the instructedCurrency
     */
    public String getInstructedCurrency() {
        return instructedCurrency;
    }

    /**
     * @param instructedCurrency the instructedCurrency to set
     */
    public void setInstructedCurrency(String instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    /**
     * @return the transactionAmount
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount the transactionAmount to set
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return the transactionCurrency
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * @param transactionCurrency the transactionCurrency to set
     */
    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    /**
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType the transactionType to set
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
