// == Define locations for build logic ==
pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        gradlePluginPortal() // if pluginManagement.repositories looks like this, it can be omitted as this is the default
    }
    includeBuild("../build-logic")
}

// == Define locations for components ==
dependencyResolutionManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://mirrors.huaweicloud.com/repository/maven/")
        mavenCentral()
    }
}
includeBuild("../platforms")
includeBuild("../admin-feature")
includeBuild("../user-feature")


// == Define the inner structure of this component ==
rootProject.name = "aggregation"
include("test-coverage")

