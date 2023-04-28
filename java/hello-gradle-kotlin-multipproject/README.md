# Hello World ~ Gradle multi-project (Kotlin)

~~~sh
./gradlew :lib:test
./gradlew :app:run
~~~

References:

* [Structuring and Building a Software Component with Gradle](https://docs.gradle.org/current/userguide/multi_project_builds.html)

Notes:

* This currently does not appear to work so well under Visual Studio Code.
  Only the composite project is seen in the Gradle panel: the composed projects are not visible.
