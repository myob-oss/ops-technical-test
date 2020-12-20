package com.myob.component;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("myHealthCheck")
public class HealthCheck implements HealthIndicator {
 
    @Override
    public Health health() {
    	//logic for health check can be added below
        int errorCode = 200;
        if (errorCode != 200) {
            return Health.down()
              .withDetail("System Down!", errorCode).build();
        }
        return Health.up().build();
    }
    
}