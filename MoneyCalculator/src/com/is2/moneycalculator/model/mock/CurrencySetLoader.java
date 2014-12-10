package com.is2.moneycalculator.model.mock;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.model.CurrencySet;

public class CurrencySetLoader implements com.is2.moneycalculator.persistence.CurrencySetLoader{

    @Override
    public CurrencySet load() {
        CurrencySet res = new CurrencySet();
        res.add(new Currency("Euro", "€", "EUR"));
        res.add(new Currency("Dollar", "$", "USD"));
        res.add(new Currency("Peseta", "Pst", "PST"));
        return res;
    }

}
