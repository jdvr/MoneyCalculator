package com.is2.moneycalculator.comtroller;

import com.is2.moneycalculator.view.ui.ExchangeDisplay;
import com.is2.moneycalculator.view.ui.MoneyDisplay;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.view.ui.ExchangeDialog;

public class ExchangeOperation {
    private final ExchangeDialog exchangeDialog;
    private final ExchangeDisplay exchangedisplay;

    public ExchangeOperation(ExchangeDialog exchangeDialog, ExchangeDisplay Exchangedisplay) {
        this.exchangeDialog = exchangeDialog;
        this.exchangedisplay = Exchangedisplay;
    }
    

    
    
    public void execute(){
        exchangedisplay.display(exchangeDialog.getExchange().getMoney());
    }
    
    
    
}
