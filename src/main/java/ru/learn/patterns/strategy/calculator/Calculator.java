package ru.learn.patterns.strategy.calculator;

import ru.learn.patterns.strategy.tariff.DefaultTariffExtractor;
import ru.learn.patterns.strategy.tariff.Tariff;
import ru.learn.patterns.strategy.tariff.TariffExtractor;

import java.util.List;

public class Calculator {

    private TariffExtractor tariffExtractor;

    public Calculator() {
        setTariffExtractor(new DefaultTariffExtractor());
    }

    public List<Tariff> getTariffList() {
        return getTariffExtractor().getTariffList();
    }

    public void setTariffExtractor(TariffExtractor tariffExtractor) {
        this.tariffExtractor = tariffExtractor;
    }

    public TariffExtractor getTariffExtractor() {
        return tariffExtractor;
    }
}
