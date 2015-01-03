package com.is2.moneycalculator.view.swing;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.view.ui.ExchangeDialog;
import com.is2.moneycalculator.view.ui.ExchangeDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    private final Currency[] currencies;
    private ActionListener actionListener;
    private ExchangeDialog exchangeDialog;
    private ExchangeDisplay exchangeDisplay;

    public MainFrame(Currency[] currencies) {
        this.currencies = currencies;
        setTitle("Juan MoneyCalculator");
        setSize(1000, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();
        setVisible(true);
    }

    private void createWidgets() {
        add(createCalculateButton(), BorderLayout.SOUTH);
        this.add(createExchangeDialogPanel(), BorderLayout.NORTH);
        this.add(createExchangeDisplayPanel(), BorderLayout.CENTER);
    }

    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(event -> actionListener.actionPerformed(event));
        return button;
    }

    private Component createExchangeDialogPanel() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencies);
        this.exchangeDialog = panel;
        return panel;
    }
    
    public ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }
    
    public ExchangeDisplay getExchangeDisplay() {
        return exchangeDisplay;
    }
    
    public void setListener(ActionListener actionListener){
        this.actionListener = actionListener;
    }

    private Component createExchangeDisplayPanel() {
        ExchangeDisplayPanel panel = new ExchangeDisplayPanel();
        this.exchangeDisplay = panel;
        return panel;
    }
    
    
}
