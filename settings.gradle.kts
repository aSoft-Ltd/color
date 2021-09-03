pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }

    enableFeaturePreview("VERSION_CATALOGS")
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }

    dependencyResolutionManagement {
        versionCatalogs {
            listOf("asoft", "jetbrains", "kotlinw", "nexus").forEach {
                create(it) { from(files("gradle/versions/$it.toml")) }
            }
        }
    }
}

rootProject.name = "color"

include(":color-core")
include(":color-css")
