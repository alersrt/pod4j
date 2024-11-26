

# ContainerHealthCheckConfig

ContainerHealthCheckConfig describes a container healthcheck with attributes like command, retries, interval, start period, and timeout.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**healthCheckOnFailureAction** | **Long** | HealthCheckOnFailureAction defines how Podman reacts when a container&#39;s health status turns unhealthy. |  [optional] |
|**healthconfig** | [**Schema2HealthConfig**](Schema2HealthConfig.md) |  |  [optional] |
|**startupHealthConfig** | [**StartupHealthCheck**](StartupHealthCheck.md) |  |  [optional] |



