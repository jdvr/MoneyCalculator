MoneyCalculator
===============

MoneyCalculator project for Software engineer 2 

This app allow user change from one currency to another.
For remote exchange rates the app uses free currencies converter api.
* Models:
  * Currency
  * Exchange
  * ExchangeRate
  * Money
  * CurrencySet
  * ExchangeRateRemote
  * ExchangeRateSet
* Persistence
  * CurrencySetLoader
  * ExchangeRateLoader
* Process
  * Exchanger
* Swing
  * ExchangeDialogPanel
  * ExchangeDisplayPanel
  * MainFrame
* View.UI
  * ExchangeDialog
  * ExchangeDisplay
  * MoneyDisplay
* Interoperability
  * CurrencySetParser
  * ExchangeRateRemoteLoader
  * FreeAPICurrencyParser
  * JSONHttpGet
  * RemoteCurrencySetLoader
* Controller
  * ExchangeOperation