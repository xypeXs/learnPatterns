package ru.learn.patterns.strategy.tariff;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Tariff {

    private BigDecimal value;
    private String currencyCode;
}
