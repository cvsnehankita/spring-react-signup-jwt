package org.moneyModal;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class MoneyModalImpl {
    public static void main(String[] args) {

        //Get currency
        Currency usd = Currency.getInstance("USD");
        Currency eur = Currency.getInstance("EUR");

        //Get Rate
        Map<String, BigDecimal> exchangeRates = new HashMap<String, BigDecimal>();
        exchangeRates.put("USD_EUR", new BigDecimal("0.85"));

        //Get amount in currency
        Money money1 = new Money(new BigDecimal("100.00"), usd);
        Money money2 = new Money(new BigDecimal("50.00"), usd);

        //Directly we can add 2 same currencies
        Money sum = money1.add(money2);
        System.out.println("Sum: " + sum); // Output: Sum: 150 USD, same currency
        ExchangeRateService exchangeRateService = new ExchangeRateService(Map.of(
                "USD_EUR", new BigDecimal("0.85")
        ));

        //Convert USD to EUR
        //Converted Amount = Amount * Exchange Rate
        Money converted = money1.convert(eur, exchangeRateService.getExchangeRate("USD", "EUR"));
        System.out.println("exchangeRateService USD to EUR " + exchangeRateService.getExchangeRate("USD", "EUR")); // Output: Converted: 85.00 EUR
        System.out.println("Converted: " + converted); // Output: Converted: 85 EUR
    }
}