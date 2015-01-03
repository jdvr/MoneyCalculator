package com.is2.moneycalculator.app;

import com.is2.moneycalculator.comtroller.ExchangeOperation;
import com.is2.moneycalculator.interoperability.FreeAPICurrencyParser;
import com.is2.moneycalculator.interoperability.RemoteCurrencySetLoader;
import com.is2.moneycalculator.interoperability.ExchangeRateRemoteLoader;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.ExchangeRateSet;
import com.is2.moneycalculator.view.swing.MainFrame;

public class Application {
    public static void main(String[] args) {
        CurrencySet currencySet = new RemoteCurrencySetLoader(new FreeAPICurrencyParser()).load();
        System.out.println("here" + currencySet.toArray().length);
        ExchangeRateSet exchangeSet = new ExchangeRateRemoteLoader().load(currencySet);
        final MainFrame appFrame = new MainFrame(currencySet.toArray());
        
        appFrame.setListener(event -> {
            new ExchangeOperation(appFrame.getExchangeDialog(), appFrame.getExchangeDisplay(), exchangeSet).execute();
        });
        
    }
}
