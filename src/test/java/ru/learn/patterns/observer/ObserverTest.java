package ru.learn.patterns.observer;

import junit.framework.TestCase;
import ru.learn.patterns.observer.api.Observer;
import ru.learn.patterns.observer.core.HttpObserver;
import ru.learn.patterns.observer.core.LoggerObserver;
import ru.learn.patterns.observer.core.EntitySubject;
import ru.learn.patterns.observer.dto.BaseEntity;
import ru.learn.patterns.observer.dto.BaseState;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ObserverTest extends TestCase {

    private static final List<BaseState> stateList = List.of(
            new BaseState("DRAFT", "Черновик"),
            new BaseState("ACTIVE", "Активный"),
            new BaseState("INACTIVE", "Неактивный")
    );


    public void testTariffList() {
        Observer<BaseEntity> httpObserver = new HttpObserver<>();
        Observer<BaseEntity> loggerObserver = new LoggerObserver<>();

        EntitySubject subject = new EntitySubject();

        subject.registerObserver(httpObserver);
        subject.registerObserver(loggerObserver);

        for (int i = 0; i < 10; i++) {
            subject.updateState(generateBaseEntity());
            subject.removeObserver(httpObserver);
        }
    }

    private BaseEntity generateBaseEntity() {
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setValue(generateValue());
        baseEntity.setBaseState(generaBaseState());
        return baseEntity;
    }

    private BaseState generaBaseState() {
        int index = ThreadLocalRandom.current().nextInt(stateList.size());
        return stateList.get(index);
    }

    private BigDecimal generateValue() {
        double randDouble = ThreadLocalRandom.current().nextDouble();
        return BigDecimal.valueOf(Math.abs(randDouble));
    }
}
