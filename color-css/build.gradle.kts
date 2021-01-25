plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    multiplatformLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains:kotlin-css:${vers.wrappers.css}")
                api(project(":color-core"))
            }
        }
        val commonTest by getting {
            dependencies {
                api(asoft("test-core", vers.asoft.test))
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.color,
    description = "A platform agnostic color library"
)
