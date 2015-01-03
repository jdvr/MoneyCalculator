package com.is2.moneycalculator.view.swing;

import com.is2.moneycalculator.model.Money;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExchangeDisplayPanel extends JPanel implements com.is2.moneycalculator.view.ui.ExchangeDisplay{

    private JLabel result;
    
    public ExchangeDisplayPanel(){
        this.setLayout(new BorderLayout());
        this.addWidget();
    }
    @Override
    public void display(Money money) {
        result.setText("Money: " + money.toString());
    }

    private void addWidget() {
        this.add(addResultBox(), BorderLayout.CENTER);
    }

    private Component addResultBox() {
        JLabel resultField = new JLabel();
        this.result = resultField;
        return resultField;
    }
    
}
