plugins {
    id("idea")
    id("eclipse")
    id("java")
    id("maven-publish")
    id("signing")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.alersrt:pod4j.openapi-java:5.0.0")
    implementation("com.squareup.okhttp3.sample:unixdomainsockets:3.14.9")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

group = "io.github.alersrt.pod4j"

java {
    withJavadocJar()
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}
