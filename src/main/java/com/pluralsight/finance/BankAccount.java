package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String name, BigDecimal balance, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void withdraw(){}
    public void deposit(){}
    public BigDecimal getValue(){
        return BigDecimal.ZERO;
    }
}
