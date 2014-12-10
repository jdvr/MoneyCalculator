package com.is2.moneycalculator.view.swing;

import com.is2.moneycalculator.model.Money;

public class ExchangeDisplay  implements com.is2.moneycalculator.view.ui.ExchangeDisplay{

    @Override
    public void display(Money money) {
        System.out.println("Money: " + money.toString());
    }
    
}
