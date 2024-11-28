plugins {
    id("idea")
    id("eclipse")
    id("java")
    id("maven-publish")
    id("signing")
    id("org.jreleaser") version "1.15.0"
    id("com.diffplug.spotless") version "6.25.0"
}

repositories {
    mavenCentral()
}

group = "io.github.alersrt"
version = "5.3.0"

dependencies {
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.fasterxml.jackson.core:jackson-core:2.18.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.3")
    testImplementation("org.mockito:mockito-core:5.11.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

tasks.withType<Javadoc> {
    (options as StandardJavadocDocletOptions)
        .tags("http.response.details:a:Http Response Details")
        .addStringOption("Xdoclint:none", "-quiet")
}

java {
    withJavadocJar()
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])
            pom {
                packaging = "jar"
                name.set("pod4j-openapi-java")
                url.set("https://github.com/alersrt/pod4j/openapi-java")
                description.set("Generated Podman API")

                scm {
                    url.set("https://github.com/alersrt/pod4j")
                    connection.set("scm:git:git://github.com/alersrt/pod4j.git")
                    developerConnection.set("scm:git:git://github.com/alersrt/pod4j.git")
                }

                inceptionYear = "2024"

                developers {
                    developer {
                        name.set("Aleksandr")
                    }
                }

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/license/mit")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            setUrl(layout.buildDirectory.dir("staging-deploy"))
        }
    }
}

jreleaser {
    project {
        inceptionYear = "2024"
        author("Aleksandr")
        description = "Podman API"
        license = "MIT"
    }
    gitRootSearch = true
    release {
        github {
            // https://github.com/jreleaser/jreleaser/discussions/367
            token = "dummy"
        }
    }
    signing {
        setActive("ALWAYS")
        armored = true
        passphrase = properties["signing.gnupg.passphrase"].toString()
        setMode("COMMAND")
        command {
            executable = properties["signing.gnupg.executable"].toString()
            keyName = properties["signing.gnupg.keyName"].toString()
        }
    }
    deploy {
        maven {
            mavenCentral {
                create("sonatype") {
                    setActive("ALWAYS")
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")
                    username.set(properties["ossrhUsername"].toString())
                    password.set(properties["ossrhPassword"].toString())
                }
            }
        }
    }
}
