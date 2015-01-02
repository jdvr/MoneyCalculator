package com.is2.moneycalculator.comtroller;

import com.is2.moneycalculator.model.ExchangeRate;
import com.is2.moneycalculator.model.ExchangeRateSet;
import com.is2.moneycalculator.process.Exchanger;
import com.is2.moneycalculator.view.ui.ExchangeDialog;
import com.is2.moneycalculator.view.ui.ExchangeDisplay;

public class ExchangeOperation {

    private final ExchangeDialog exchangeDialog;
    private final ExchangeDisplay exchangedisplay;
    private final ExchangeRateSet exchangeRateSet;

    public ExchangeOperation(ExchangeDialog exchangeDialog, ExchangeDisplay Exchangedisplay, ExchangeRateSet exchangeRateSet) {
        this.exchangeDialog = exchangeDialog;
        this.exchangedisplay = Exchangedisplay;
        this.exchangeRateSet = exchangeRateSet;
    }

    public void execute() {

        exchangedisplay.display(
                new Exchanger().execute(exchangeDialog.getExchange().getMoney(), getExchangeRate()));
    }

    private ExchangeRate getExchangeRate() {
        return exchangeRateSet.get(exchangeDialog.getExchange().getMoney().getCurrency(),
                exchangeDialog.getExchange().getCurrency());
    }

}
