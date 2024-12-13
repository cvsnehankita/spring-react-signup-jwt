package org.moneyModal;

import java.math.BigDecimal;
import java.util.Map;

public class ExchangeRateService {
    private final Map<String, BigDecimal> exchangeRates;
    public ExchangeRateService(Map<String, BigDecimal> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }
    public BigDecimal getExchangeRate(String fromCurrency, String toCurrency) {
        String key = fromCurrency + "_" + toCurrency;
        if (!exchangeRates.containsKey(key)) {
            throw new IllegalArgumentException("Exchange rate not found for " + key);
        }
        return exchangeRates.get(key);
    }
}
