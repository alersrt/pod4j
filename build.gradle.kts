plugins {
    id("java")
    id("org.openapi.generator") version "7.8.0"
}

group = "io.github.alersrt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":podman-api"))
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.openApiGenerate {
    cleanupOutput.set(true)
    generatorName.set("java")
    outputDir.set("${rootDir.absolutePath}/podman-api")
    remoteInputSpec.set("${rootDir.absolutePath}/swagger-latest.yaml")
    packageName.set("io.github.alersrt.pod4j.api")

    groupId.set(project.group.toString())
    id.set("podman-api")
    version.set(project.version.toString())
}