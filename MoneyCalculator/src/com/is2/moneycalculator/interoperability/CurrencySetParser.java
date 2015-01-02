package com.is2.moneycalculator.interoperability;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.model.CurrencySet;
import java.util.Map;

public interface CurrencySetParser {
    public Currency mapToCurrency(Map currency);
    public CurrencySet decodeCurrencySet(String currencySet);
    
}
