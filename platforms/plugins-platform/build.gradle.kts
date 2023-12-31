plugins {
    id("java-platform")
}

group = "com.example.platform"

dependencies {
    constraints {
        api("com.android.tools.build:gradle:8.1.3")
        api("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:1.9.20")
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.9.20")
        api("org.springframework.boot:org.springframework.boot.gradle.plugin:3.1.5")
    }
}
