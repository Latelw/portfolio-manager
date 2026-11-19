package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements Valuable {
    private String name;
    private int accountNumber;
    private int balance;

    public CreditCard(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public void charge(){}
    public void pay() {}
    public BigDecimal getValue() {
        return BigDecimal.ZERO;
    }

}
