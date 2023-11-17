// == Define locations for build logic ==
pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        gradlePluginPortal()
        google()
    }
    includeBuild("../build-logic")
}

// == Define locations for components ==
dependencyResolutionManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://mirrors.huaweicloud.com/repository/maven/")
        mavenCentral()
        google()
    }
}
includeBuild("../platforms")
includeBuild("../user-feature")

// == Define the inner structure of this component ==
rootProject.name = "android-app"
include("app")
