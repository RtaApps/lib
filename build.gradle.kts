plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
}

group = "cat.moki.jizhang"

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
