package ru.learn.patterns.factory.factorymethod.product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractProduct {
    protected List<BigDecimal> tariffList;
}
