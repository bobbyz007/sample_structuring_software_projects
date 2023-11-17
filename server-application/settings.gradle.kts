// == Define locations for build logic ==
pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        gradlePluginPortal()
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
includeBuild("../user-feature")
includeBuild("../admin-feature")

// == Define the inner structure of this component ==
rootProject.name = "server-application" // the component name
include("app")
