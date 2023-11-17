plugins {
    id("java-platform")
}

group = "com.example.platform"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:3.1.5"))

    constraints {
        api("org.apache.juneau:juneau-marshall:9.0.1")
    }
}
