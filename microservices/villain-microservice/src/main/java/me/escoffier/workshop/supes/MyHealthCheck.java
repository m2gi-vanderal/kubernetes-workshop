package me.escoffier.workshop;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness // Contribute to the liveness check
public class MyHealthCheck implements HealthCheck { // Implement health check
    @Override
    public HealthCheckResponse call() { // Implementation of the check
        return HealthCheckResponse.up("Villains still stand !");
    }
}
