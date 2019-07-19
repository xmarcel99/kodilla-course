package com.kodilla.patterns2.facade;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FasadeAspect {
    public static Logger LOGGER = LoggerFactory.getLogger(FasadeAspect.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
            + "&& target(object)")
    public void beforeMethodStartInfo(Object object) {
        LOGGER.info("Class: " + object.getClass().getName());
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void afterMethodInfo() {
        LOGGER.info("Method executed without any exceptions ;)");
    }
}
