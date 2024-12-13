package org.moneyModal;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {

    @Getter
    private final BigDecimal amount;
    @Getter
    private final Currency currency;
    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public Money add(Money other) {
        isSameCurrency(other);
        return new Money(this.amount.add(other.amount), this.currency);
    }
    public Money subtract(Money other) {
        isSameCurrency(other);
        return new Money(this.amount.subtract(other.amount), this.currency);
    }
    public Money multiply(BigDecimal multiplier) {
        return new Money(this.amount.multiply(multiplier), this.currency);
    }
    public Money convert(Currency targetCurrency, BigDecimal exchangeRate) {
        BigDecimal newAmount = this.amount.multiply(exchangeRate);
        return new Money(newAmount, targetCurrency);
    }
    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount.equals(money.amount) && currency.equals(money.currency);
    }

    private void isSameCurrency(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Difference in Currencies, match not found.");
        }
    }
    @Override
    public String toString() {
        return amount + " " + currency.getCurrencyCode();
    }
}