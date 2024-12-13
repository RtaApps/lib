plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
}

group = "cat.moki.jizhang"
version = "1"

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
