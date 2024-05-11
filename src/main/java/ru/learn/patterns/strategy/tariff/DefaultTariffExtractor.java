package ru.learn.patterns.strategy.tariff;

import java.util.Collections;
import java.util.List;

public class DefaultTariffExtractor implements TariffExtractor {

    @Override
    public List<Tariff> getTariffList() {
        return Collections.emptyList();
    }
}
