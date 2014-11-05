package com.is2.moneycalculator.model;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class CurrencySet{
    private Set<Currency> currencies;
    
    public CurrencySet(){
        currencies = new HashSet<>();
    }
    
    public void add(Currency newCurrency){
        currencies.add(newCurrency);
    }
    
    public Currency get(String currencyName){
        final Predicate<Currency> nameFilter = currency -> currency.getName().equals(currencyName);
        return currencies.stream()
                         .filter(nameFilter)
                         .findAny()
                         .get();
    }
    
}
