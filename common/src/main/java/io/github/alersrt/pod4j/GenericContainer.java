package io.github.alersrt.pod4j;

import io.github.alersrt.pod4j.exceptions.PodmanException;

public interface GenericContainer {

    /**
     * Creates the pod or container and immediately starts it. All created resources will be
     * cleared out when a SIGTERM is received or pods exit.
     */
    void start() throws PodmanException;

    /**
     * Stops the pod or container with clearing created volumes.
     */
    void stop() throws PodmanException;

    /**
     * Specify service and its port for expose.
     *
     * @param serviceName name of service to expose.
     * @param exposedPort port to expose.
     * @return container with exposed services.
     */
    GenericContainer withExposedService(final String serviceName, final int exposedPort) throws PodmanException;

    /**
     * Getting mapped host for the given service's name and exposed port.
     *
     * @param serviceName the service name.
     * @param exposedPort the exposed port.
     * @return mapped host.
     */
    String getMappedHost(final String serviceName, final int exposedPort) throws PodmanException;

    /**
     * Getting mapped port for the given service's name and exposed port.
     *
     * @param serviceName the service name.
     * @param exposedPort the exposed port.
     * @return mapped host.
     */
    int getMappedPort(final String serviceName, final int exposedPort) throws PodmanException;

}
