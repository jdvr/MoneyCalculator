package com.is2.moneycalculator.interoperability;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.ExchangeRate;
import com.is2.moneycalculator.model.ExchangeRateSet;
import com.is2.moneycalculator.interoperability.JSONHttpGet;

public class ExchangeRateRemoteLoader implements com.is2.moneycalculator.persistence.ExchangeRateLoader{
    
    private static final String baseURL = "http://www.freecurrencyconverterapi.com/api/v2/convert?q=";
    private static final String urlSufix = "&compact=y";
    
    @Override
    public ExchangeRateSet load(CurrencySet aviableCurrencies) {
        ExchangeRateSet result = new ExchangeRateSet();
        for (Currency fromCurrency : aviableCurrencies.getNCurrencies(5)) {
            for (Currency toCurrency : aviableCurrencies.getNCurrencies(5)){
                if(fromCurrency == toCurrency) continue;
                result.add(new ExchangeRate(fromCurrency, toCurrency, getRate(fromCurrency, toCurrency)));
            }
        }
        return result;   
        
    }

    private Double getRate(Currency fromCurrency, Currency toCurrency) {
        String url =  baseURL + fromCurrency.getCode()+ "_" + toCurrency.getCode() + urlSufix;
        System.out.println( new JSONHttpGet().getJsonFromUrl(url) + "  " + url);
        return 0.0;
    }

    
    
}
