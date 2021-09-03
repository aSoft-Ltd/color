plugins {
    alias(jetbrains.plugins.kotlin.multiplatform)
    alias(asoft.plugins.library)
    alias(nexus.plugins.publish)
    signing
}

kotlin {
    jvm { library() }
    js(IR) { library() }
    iosTargets(true)
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":color-core"))
                api(kotlinw.css)
            }
        }
        val commonTest by getting {
            dependencies { api(asoft.expect.core) }
        }
    }
}

aSoftOSSLibrary(
    version = asoft.versions.color.get(),
    description = "A platform agnostic color library for css"
)
