plugins {
    id("java-platform")
}

group = "com.example.platform"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
// gradle的platform插件默认是不允许配置依赖的，只能配置constraints。如果也需要配置依赖，则加上此方法。
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:3.1.5"))

    constraints {
        api("org.apache.juneau:juneau-marshall:9.0.1")
    }
}
