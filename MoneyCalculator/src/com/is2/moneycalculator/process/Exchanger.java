
package com.is2.moneycalculator.process;

import com.is2.moneycalculator.model.ExchangeRate;
import com.is2.moneycalculator.model.Money;

public class Exchanger {
    public Money execute (Money currentMoney, ExchangeRate rate){
        return new Money(
                currentMoney.getAmount() * rate.getRate(), 
                rate.getTo());
    }
}
