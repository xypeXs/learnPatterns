package ru.learn.patterns.decorator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class RiskDto {
    private BigDecimal premium;
    private BigDecimal amount;

    public static RiskDto merge(RiskDto dto1, RiskDto dto2) {
        return new RiskDto(dto1.getPremium().add(dto2.getPremium()), dto1.getAmount().add(dto2.getAmount()));
    }
}
