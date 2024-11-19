plugins {
    id("idea")
    id("eclipse")
    id("java")
    id("maven-publish")
    id("com.diffplug.spotless") version "6.11.0"
}

group = "io.github.alersrt.pod4j"
version = "5.0.0"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "openapi-java"
            from(components["java"])
        }
    }
}

dependencies {
    implementation("io.swagger:swagger-annotations:1.6.8")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.google.code.gson:gson:2.9.1")
    implementation("io.gsonfire:gson-fire:1.9.0")
    implementation("javax.ws.rs:jsr311-api:1.1.1")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("jakarta.annotation:jakarta.annotation-api:1.3.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testImplementation("org.mockito:mockito-core:3.12.4")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

// Use spotless plugin to automatically format code, remove unused import, etc
// To apply changes directly to the file, run `gradlew spotlessApply`
// Ref: https://github.com/diffplug/spotless/tree/main/plugin-gradle
spotless {
    format("misc", {
        // define the files (e.g. '*.gradle', '*.md') to apply `misc` to
        target(".gitignore")
        // define the steps to apply to those files
        trimTrailingWhitespace()
        indentWithSpaces() // Takes an integer argument if you don't like 4
        endWithNewline()
    })
    java {
        // don't need to set target, it is inferred from java
        // apply a specific flavor of google-java-format
        googleJavaFormat("1.8").aosp().reflowLongStrings()
        removeUnusedImports()
        importOrder()
    }
}

tasks.test {
    // Enable JUnit 5 (Gradle 4.6+).
    useJUnitPlatform()
}
