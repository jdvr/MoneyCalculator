package com.is2.moneycalculator.model;

import java.util.ArrayList;
import java.util.List;

public class CurrencySet{
    private final List<Currency> list = new ArrayList<>();

    public boolean add(Currency currency) {
        return list.add(currency);
    }

    public Currency get(int index) {
        return list.get(index);
    }

    public Currency[] toArray() {
        return list.toArray(new Currency[list.size()]);
    }
    
}
