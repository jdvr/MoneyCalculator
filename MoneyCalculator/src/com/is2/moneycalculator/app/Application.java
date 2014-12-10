package com.is2.moneycalculator.app;

import com.is2.moneycalculator.comtroller.ExchangeOperation;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.Money;
import com.is2.moneycalculator.model.mock.CurrencySetLoader;
import com.is2.moneycalculator.view.swing.ExchangeDisplay;
import com.is2.moneycalculator.view.swing.MainFrame;

public class Application {
    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final MainFrame appFrame = new MainFrame(currencySet.toArray());
        
        appFrame.setListener(event -> {
            new ExchangeOperation(appFrame.getExchangeDialog(), new ExchangeDisplay()).execute();
        });
        
    }
}
