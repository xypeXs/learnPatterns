package ru.learn.patterns.observer.core;

import ru.learn.patterns.observer.api.AbstractSubject;
import ru.learn.patterns.observer.dto.BaseEntity;
import ru.learn.patterns.observer.dto.BaseState;

import java.math.BigDecimal;

public class EntitySubject extends AbstractSubject<BaseEntity> {

    private BigDecimal value;
    private BaseState baseState;

    public EntitySubject() {
        super();
    }

    public void updateState(BaseEntity newBaseEntity) {
        this.value = newBaseEntity.getValue();
        this.baseState = newBaseEntity.getBaseState();
        notifyObservers(new BaseEntity(value, baseState));
    }
}
