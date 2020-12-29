package com.company;

public class BankAccount {


    private String accountNum;
    private double balance;
    private String custName;
    private String email;
    private String phoneNum;

    public BankAccount(String custName, String email, String phoneNum) {
        this("12318273", 283675,custName, email, phoneNum);

    }

    public BankAccount(String accountNum, double balance, String custName, String email, String phoneNum) {
        this.accountNum=accountNum;
        this.balance=balance;
        this.email=email;
        this.phoneNum=phoneNum;
        this.custName=custName;


    }
    public String getAccountNum(){
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustName() {
        return custName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void deposit(double depositAmt){
        this.balance=this.balance+depositAmt;
        System.out.println("Remaining amount after deposit= " + this.balance);
    }
    public void withdraw(double withdrawAmt){
        if(this.balance-withdrawAmt<0)
            System.out.println("Withdrawal not processed cause insufficient balance");
        else
            this.balance=this.balance-withdrawAmt;
        System.out.println("Remaining amount after withdrawal= " + this.balance);
    }



}
