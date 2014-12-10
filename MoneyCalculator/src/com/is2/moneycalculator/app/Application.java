package com.is2.moneycalculator.app;

import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.persistence.CurrencySetLoader;

public class Application {
    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load()
    }
}
