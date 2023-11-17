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
includeBuild("../domain-model")
includeBuild("../state")

// == Define the inner structure of this component ==
rootProject.name = "admin-feature"
include("config")
