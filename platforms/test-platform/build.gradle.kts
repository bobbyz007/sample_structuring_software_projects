plugins {
    id("java-platform")
}

group = "com.example.platform"

// allow the definition of dependencies to other platforms like the JUnit 5 BOM
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.junit:junit-bom:5.10.1"))
}
