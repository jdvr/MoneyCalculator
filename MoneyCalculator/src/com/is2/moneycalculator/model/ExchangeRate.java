package com.is2.moneycalculator;

import java.util.Date;

public class ExchangeRate {
    
    private final Currency from;
    private final Currency to;
    private final Double rate;
    private final Date date;

    public ExchangeRate(Currency from, Currency to) {
        this.from = from;
        this.to = to;
    }
       

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Double getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }
    
    
    
    
}
