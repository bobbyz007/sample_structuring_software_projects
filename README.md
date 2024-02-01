Gradle官方文档演示的构建大型项目的结构，来自：
https://docs.gradle.org/current/userguide/structuring_software_products.html
***
This sample shows how to structure a software product that consists of multiple components as a set of connected Gradle builds.
As such, it shows how Gradle is used to model a project's architecture and reflect that in the physical structure of the files that make up the software.
This example is described as part of the [documentation on this topic](https://docs.gradle.org/current/userguide/structuring_software_products.html).

The product that is built in this sample is an application that displays [Gradle Build Tool releases](https://gradle.org/releases/).

There are different ways to work with the sample:

- You may build or import the umbrella build in the root.
  There you can, for example, run the Spring Boot web application via `./gradlew :server-application:app:bootRun` or install the Android app using `./gradlew :android-app:app:installDebug`.
- You may only build or import one of the application builds directly.
  For example, `cd server-application` and run the app using  `../gradlew :app:bootRun`.
- You may only build or import a selected component (and its dependencies).
  For example, only import the `user-feature` build in the IDE.

// TODO:Finalize Upload Removal - Issue #21439
