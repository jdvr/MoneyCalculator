package com.is2.moneycalculator;

import java.util.Date;

public class Exchange {

    private final Money money;
    private final Currency currency;
    private final Date date;

    public Exchange(Money money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }

    public Money getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Date getDate() {
        return date;
    }
    
    
            
}
