# Money Model for multiple-currency environment

A Money Model in a multiple-currency environment is a structured representation of monetary values 
and their associated currencies that ensures accuracy, consistency, and flexibility for financial 
operations across different currencies.

To conclude, when different countries of different currency standards are involved, the Money Model
represents a global standard to enable a smooth transaction between two different countries.

### 5 Key Elements of a Money Model

1. Amount: Numerical value of money.
2. Currency: Type of currency 
3. Exchange Rate (if needed): The rate for converting between currencies.
4. Precision: Defines the number of decimal places for accuracy.
5. Immutability: Ensure all operations return a new Money object, preserving the original.

### Calculation 
Converted Amount = Amount * Exchange Rate

### Implementation
Please refer below implementation from package moneyModal.
1. org/moneyModal/MoneyModalImpl.java

### Example
USD (US Dollar) ->  EUR (Euro) with exchange rate of 0.85 for amount of 100 USD is 85 EUR.

### Detailed Overview

1. Create new Money Object
Money usdMoney = new Money(new BigDecimal("100.00"), Currency.getInstance("USD"));

2. Add two same currency:
Money sum = usdMoney.add(new Money(new BigDecimal("50.00"), Currency.getInstance("USD")));

3. Convert to another currency:
Money eurMoney = usdMoney.convert(Currency.getInstance("EUR"), new BigDecimal("0.85"));

### Contact
Your suggestions are always welcome as "cvsnehankita@gmail.com".