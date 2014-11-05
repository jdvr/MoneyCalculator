package com.is2.moneycalculator.model.mock;

import com.is2.moneycalculator.model.Currency;
import java.util.HashSet;
import java.util.Set;

public class CurrencySetMocker {

    public CurrencySetMocker() {

    }

    public Set<Currency> loadMock() {
        Set<Currency> res = new HashSet<>();
        res.add(new Currency("Euro", "€", "EUR"));
        res.add(new Currency("Dollar", "$", "USD"));
        res.add(new Currency("Peseta", "Pst", "PST"));
        return res;
    }

}
