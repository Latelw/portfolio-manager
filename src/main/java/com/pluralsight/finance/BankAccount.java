package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void withdraw(BigDecimal amount){}
    public void deposit(BigDecimal amount){}
    public BigDecimal getValue(){
        return BigDecimal.ZERO;
    }
}
