package ru.learn.patterns.factory.abstractfactory.productconfiguration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractProductConfiguration {
    private Date startDate;
    private Date finishDate;

}
