package ru.learn.patterns.factory.abstractfactory.productconfiguration;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ProductAConfiguration extends AbstractProductConfiguration {
    public ProductAConfiguration() {
        super(Date.from(Instant.parse("2024-01-01T00:00:00.000Z").minus(3, ChronoUnit.HOURS)), Date.from(Instant.parse("2025-01-01T23:59:59.999Z").minus(3, ChronoUnit.HOURS)));
    }
}
