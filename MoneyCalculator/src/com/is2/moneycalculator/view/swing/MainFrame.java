package com.is2.moneycalculator.view.swing;

import com.is2.moneycalculator.model.Currency;
import com.is2.moneycalculator.view.ui.ExchangeDialog;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    private final Currency[] currencies;
    private ActionListener actionListener;
    private ExchangeDialogPanel exchangeDialogPanel;

    public MainFrame(Currency[] currencies) {
        this.currencies = currencies;
        setTitle("Juan MoneyCalculator");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();
        setVisible(true);
    }

    private void createWidgets() {
        add(createCalculateButton(), BorderLayout.SOUTH);
        this.add(createExchangeDialogPanel());
    }

    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(event -> actionListener.actionPerformed(event));
        return button;
    }

    private Component createExchangeDialogPanel() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencies);
        this.exchangeDialogPanel = panel;
        return panel;
    }
    
    
    
}
