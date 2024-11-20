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
version = "5.0.0"

dependencies {
    implementation("io.swagger:swagger-annotations:1.6.14")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.google.code.gson:gson:2.10")
    implementation("io.gsonfire:gson-fire:1.9.0")
    implementation("javax.ws.rs:jsr311-api:1.1")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("org.apache.commons:commons-lang3:3.15.0")
    implementation("javax.annotation:javax.annotation-api:1.3")
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
        googleJavaFormat("1.24.0").aosp().reflowLongStrings()
        removeUnusedImports()
        importOrder()
    }
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
