package ru.learn.patterns.strategy.tariff;

import java.util.List;

public interface TariffExtractor {

    List<Tariff> getTariffList();
}
