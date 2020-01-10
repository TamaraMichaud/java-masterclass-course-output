package com.michaud.tamara.constructors;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //TODO: note that you can call a constructor from another constructor... i think we knew that actually...
    public BankAccount(){
        this("my4cc0untN0", 9431.02, "Richy Rich", "no@contact.me", "123356567");
//        this("my4cc0untN0"); // ^^ only one though...
        System.out.println("No values given, setting defaults");
    }

    public BankAccount(String testingMore) {
        // cant call this one too from within a single constructor... probably messed up the design if you need this anyway
    }


    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(double depositAmount) {
        this.balance += depositAmount;   // TODO: notice that the automatic setters and getters user this... so be consistent...
    }

    public void makeWithdrawal(double withdrawnAmount) {
        if (this.balance - withdrawnAmount >= 0) {
            this.balance -= withdrawnAmount;
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
