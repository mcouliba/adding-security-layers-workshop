package com.github.lbroudoux.fruits.catalog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

/**
 * A Spring Micrometer aspect for adding time metrics.
 * @author laurent
 */
@Configuration
@EnableAspectJAutoProxy
public class TimedConfiguration {
    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }
}
