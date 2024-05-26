package ru.learn.patterns.decorator;

import java.math.BigDecimal;
import java.util.Map;

public class RiskDao {

    private static final Map<String, RiskDto> SYS_NAME_PRICE_MAP = Map.ofEntries(
            Map.entry(Constants.DEATH_RISK,      new RiskDto(BigDecimal.valueOf(1568.00d), BigDecimal.valueOf(4_000_000))),
            Map.entry(Constants.INJURY_RISK,     new RiskDto(BigDecimal.valueOf(850.00d), BigDecimal.valueOf(1_000_000))),
            Map.entry(Constants.DISABILITY_RISK, new RiskDto(BigDecimal.valueOf(1312.50d), BigDecimal.valueOf(2_000_000)))
    );

    public static RiskDto getRiskBySysName(String sysName) {
        return SYS_NAME_PRICE_MAP.get(sysName);
    }
}
