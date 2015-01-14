package com.is2.moneycalculator.app;

import com.is2.moneycalculator.comtroller.ExchangeOperation;
import com.is2.moneycalculator.interoperability.remote.ExchangeRateRemoteLoader;
import com.is2.moneycalculator.interoperability.remote.FreeAPICurrencyParser;
import com.is2.moneycalculator.interoperability.remote.RemoteCurrencySetLoader;
import com.is2.moneycalculator.model.CurrencySet;
import com.is2.moneycalculator.model.ExchangeRate;
import com.is2.moneycalculator.model.ExchangeRateSet;
import com.is2.moneycalculator.persistence.ExchangeRateLocalLoader;
import com.is2.moneycalculator.persistence.LocalCurrencySetLoader;
import com.is2.moneycalculator.view.swing.MainFrame;

public class Application {
    public static void main(String[] args) {
        CurrencySet currencySet = new LocalCurrencySetLoader().load();
        System.out.println("here" + currencySet.toArray().length);
        ExchangeRateSet exchangeSet = new ExchangeRateLocalLoader().load(currencySet);
        System.out.println("there" + exchangeSet.getSet().size());
        final MainFrame appFrame = new MainFrame(currencySet.toArray());
        
        appFrame.setListener(event -> {
            new ExchangeOperation(appFrame.getExchangeDialog(), appFrame.getExchangeDisplay(), exchangeSet).execute();
        });
        
    }
}
