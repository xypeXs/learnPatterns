package ru.learn.patterns.strategy.tariff;

import ru.learn.patterns.Constants;

import java.math.BigDecimal;
import java.util.List;

public class RubleTariffExtractor implements TariffExtractor {

    private static final List<Tariff> tariffList = List.of(
            new Tariff(BigDecimal.valueOf(1000.00d), Constants.Currency.RUB),
            new Tariff(BigDecimal.valueOf(1250.00d), Constants.Currency.RUB),
            new Tariff(BigDecimal.valueOf(1500.00d), Constants.Currency.RUB)
    );

    @Override
    public List<Tariff> getTariffList() {
        return RubleTariffExtractor.tariffList;
    }
}
