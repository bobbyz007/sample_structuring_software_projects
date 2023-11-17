plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

group = "com.example.myproduct"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

android {
    namespace = "android-application"
    compileSdk = 31
    defaultConfig {
        minSdk = 24
        targetSdk = 31
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(platform("com.example.platform:product-platform"))
    testImplementation(platform("com.example.platform:test-platform"))

    implementation(kotlin("stdlib"))
}
