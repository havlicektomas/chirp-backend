plugins {
    id("chirp.spring-boot-app")
}

group = "dev.havlicektomas"
version = "0.0.1-SNAPSHOT"
description = "Backend for chirp chat"

dependencies {
    implementation(projects.user)
    implementation(projects.chat)
    implementation(projects.notification)
    implementation(projects.common)

    implementation(libs.kotlin.reflect)
    implementation(libs.spring.boot.starter.security)

    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)
}
