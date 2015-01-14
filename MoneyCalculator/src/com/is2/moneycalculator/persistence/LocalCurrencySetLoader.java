
package com.is2.moneycalculator.persistence;

import com.google.gson.Gson;
import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.model.CurrencySet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LocalCurrencySetLoader implements CurrencySetLoader{

    @Override
    public CurrencySet load() {
        ArrayList<String> rawData = new ArrayList<>();
        try {
            rawData = getData();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return (rawData.isEmpty())? new CurrencySet() : parserRawDataToCurrencySet(rawData);
    }
    
    private ArrayList<String> getData() throws IOException {
        ArrayList<String> content = new ArrayList<>();
        try{
            File f = new File("currencies");
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

    private CurrencySet parserRawDataToCurrencySet( ArrayList<String> rawData) {
        CurrencySet result = new CurrencySet();
        for (String currencyString : rawData){
            String[] dataParsed = currencyString.split(";");
            result.add(new Currency(dataParsed[0], dataParsed[1]));
        }
        
        return result;
    
    }
    
}
