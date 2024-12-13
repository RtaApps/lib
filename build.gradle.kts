plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
}

group = "cat.moki.jizhang"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        register<MavenPublication>("release") {

            groupId = "cat.moki.jizhang"
            artifactId = "lib"
            version = "1.0-SNAPSHOT" // Ensure this matches your versioning

        }
    }
}