package com.is2.moneycalculator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ExchangeRateSet {
    private final List<ExchangeRate> exchangeRates = new ArrayList<>();
    
    public boolean add(ExchangeRate newExchangeRate) {
        return exchangeRates.add(newExchangeRate);
    }

    public ExchangeRate get(int index) {
        return exchangeRates.get(index);
    }
    public List<ExchangeRate> getSet(){
        return exchangeRates;
    }
    
    public ExchangeRate get(Currency from, Currency to){
        try{
            return exchangeRates.stream()
                            .filter(exchangeRate -> exchangeRate.getFrom().getCode().equals(from.getCode()))
                            .filter(exchangeRate -> exchangeRate.getTo().getCode().equals(to.getCode()))
                            .findFirst()
                            .get();
        }catch(NoSuchElementException e){
            return null;
        }
    }
}
