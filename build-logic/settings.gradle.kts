dependencyResolutionManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://mirrors.huaweicloud.com/repository/maven/")
        google()
    }
}
includeBuild("../platforms")

rootProject.name = "build-logic"
include("commons")
include("java-library")
include("kotlin-library")
include("android-application")
include("spring-boot-application")
include("report-aggregation")
