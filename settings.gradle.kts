pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Naver Maps
        maven("https://naver.jfrog.io/artifactory/maven/")

    }
}

rootProject.name = "PosingOttae"
include(":app")
