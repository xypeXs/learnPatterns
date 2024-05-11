package ru.learn.patterns.strategy.tariff;

import ru.learn.patterns.Constants;

import java.math.BigDecimal;
import java.util.List;

public class USDTariffExtractor implements TariffExtractor {
    private static final List<Tariff> tariffList = List.of(
            new Tariff(BigDecimal.valueOf(10.00d), Constants.Currency.USD),
            new Tariff(BigDecimal.valueOf(12.50d), Constants.Currency.USD),
            new Tariff(BigDecimal.valueOf(15.00d), Constants.Currency.USD)
    );

    @Override
    public List<Tariff> getTariffList() {
        return USDTariffExtractor.tariffList;
    }
}
