package com.is2.moneycalculator.interoperability.remote;

import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.persistence.CurrencySetLoader;

public class RemoteCurrencySetLoader  implements CurrencySetLoader{

    private final CurrencySetParser parser;
    private static final String FREE_API_URL = "http://www.freecurrencyconverterapi.com/api/v2/currencies";

    public RemoteCurrencySetLoader(CurrencySetParser parser) {
        this.parser = parser;
    }
        
    @Override
    public CurrencySet load() {
        String encodeCurrencySet = new JSONHttpGet().getJsonFromUrl(FREE_API_URL);
        return parser.decodeCurrencySet(encodeCurrencySet);        
    }
    
}
