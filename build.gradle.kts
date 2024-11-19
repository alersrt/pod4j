plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3.sample:unixdomainsockets:3.14.9")
    implementation(project(":openapi-java"))
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}


configure(subprojects) {
    apply(plugin = "idea")
    apply(plugin = "eclipse")
    apply(plugin = "java")
    apply(plugin = "maven-publish")
    apply(plugin = "signing")

    group = "io.github.alersrt.pod4j"

    java {
        withJavadocJar()
        withSourcesJar()
    }

    tasks.test {
        useJUnitPlatform()
    }
}
