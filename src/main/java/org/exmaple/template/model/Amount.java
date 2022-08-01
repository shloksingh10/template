package org.exmaple.template.model;

public class Amount {
    public enum CurrencyType {
        USD,
        INR
    }
    private CurrencyType currency;

    private Double value;

    public Amount(CurrencyType currency, Double value) {
        this.currency = currency;
        this.value = value;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
