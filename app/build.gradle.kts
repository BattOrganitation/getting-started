plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    alias(libs.plugins.shadow)
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(libs.guava)
    implementation(libs.koog.agents)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.example.AppKt"
}
