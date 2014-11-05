package com.is2.moneycalculator;

public class Money {
    
    private final Integer amount;
    private final Currency currency;

    public Money(Integer amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
    
    
}
