package com.is2.moneycalculator.persistence;

import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.ExchangeRateSet;



public interface ExchangeRateLoader {
    public ExchangeRateSet load(CurrencySet aviableCurrencies);
}
