package com.myob.component;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class ResponseCode  implements HealthIndicator {
	
	@Override
	public Health health() {
		int errorCode = 200; // perform some specific health check
		if (errorCode != 0) {
			return Health.up().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}
}