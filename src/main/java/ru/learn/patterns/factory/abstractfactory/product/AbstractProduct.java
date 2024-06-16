package ru.learn.patterns.factory.abstractfactory.product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractProduct {
    protected String sysName;
}
