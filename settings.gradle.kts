pluginManagement {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven ("https://jitpack.io")
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        jcenter()
        maven  ("https://jitpack.io")
        maven("https://plugins.gradle.org/m2/")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}




// TODO: Update project's name.
rootProject.name = "GodotAndroidPluginTemplate"
include(":plugin")
