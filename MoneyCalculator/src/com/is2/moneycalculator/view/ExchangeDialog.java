package com.is2.moneycalculator.view;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.Exchange;
import com.is2.moneycalculator.model.ExchangeRate;
import com.is2.moneycalculator.model.Money;

public class ExchangeDialog {
    //TODO
    private final CurrencySet currentCurrencies;
    private Exchange exchange;
    
    public ExchangeDialog(CurrencySet currentCurrencies) {
        this.currentCurrencies = currentCurrencies;
    }
    
    public Exchange readExchange(){
        return new Exchange(
                readMoney(),
                readCurrency("Choose output currency")
        );
    }
    
    private Money readMoney(){
        return new Money(
                readAmoung("Write your money amount"),
                readCurrency("Choose your money currency")
        );
    }
    
    private Double readAmoung(String messge){
        return null;
    }
    
    private Currency readCurrency(String message){
        return null;
    }
}
