package com.is2.moneycalculator.persistence;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.ExchangeRate;
import com.is2.moneycalculator.model.ExchangeRateSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ExchangeRateLocalLoader implements ExchangeRateLoader{

    @Override
    public ExchangeRateSet load(CurrencySet aviableCurrencies) {
        ArrayList<String> rawData = new ArrayList<>();
        try {
            rawData = getData();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return (rawData.isEmpty())? new ExchangeRateSet(): parserRawDataToExchangeRateSet(rawData, aviableCurrencies);
    }
    
    private ArrayList<String> getData() throws IOException {
        ArrayList<String> content = new ArrayList<>();
        try{
            File f = new File("exchangerate");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String line;
            while ((line = bf.readLine()) != null) {
                content.add(line);                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Can't found file");
        }
        return content;
    }

    private ExchangeRateSet parserRawDataToExchangeRateSet( ArrayList<String> rawData, CurrencySet aviable) {
        ExchangeRateSet result = new ExchangeRateSet();
        for (String currencyString : rawData){
            String[] dataParsed = currencyString.split(";");
            result.add(new ExchangeRate(aviable.get(dataParsed[0]), 
                                        aviable.get(dataParsed[1]), 
                                        Double.parseDouble(dataParsed[2])));
        }
        return fillAllPosibilities(result, aviable);
    
    }

    private ExchangeRateSet fillAllPosibilities(ExchangeRateSet halfSet, CurrencySet aviable) {
        Currency baseCurrency =  aviable.get("EUR");
        for (Currency currencyFrom : aviable.getSet()) {
            for (Currency currencyTo : aviable.getSet()) {
                if (halfSet.get(currencyFrom, currencyTo) != null) continue;
                halfSet.add(new ExchangeRate(currencyFrom, currencyTo, 
                    halfSet.get(baseCurrency, currencyTo).getRate() / halfSet.get(baseCurrency, currencyFrom).getRate()));
            }
        }
        return halfSet; 
    }
    
}
