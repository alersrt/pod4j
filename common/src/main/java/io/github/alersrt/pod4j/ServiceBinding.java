package io.github.alersrt.pod4j;

import lombok.Getter;

/**
 * Service binging.
 */
@Getter
public class ServiceBinding {

    /**
     * Name of service that owns the exposed port.
     */
    private final String serviceName;

    /**
     * Host of exposed service.
     */
    private final String serviceHost;

    /**
     * Exposed port.
     */
    private final int exposedPort;

    /**
     * Mapped port.
     */
    private final int mappedPort;

    /**
     * Creates port binding.
     *
     * @param serviceName the name of service that owns by the given port.
     * @param serviceHost the service's host.
     * @param exposedPort the exposed port.
     * @param mappedPort  the mapped port.
     */
    public ServiceBinding(String serviceName,
                          String serviceHost,
                          int exposedPort,
                          int mappedPort) {
        this.serviceName = serviceName;
        this.serviceHost = serviceHost;
        this.exposedPort = exposedPort;
        this.mappedPort = mappedPort;
    }
}
