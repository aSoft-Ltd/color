plugins {
    alias(jetbrains.plugins.kotlin.multiplatform)
    alias(asoft.plugins.library)
    alias(nexus.plugins.publish)
    signing
}

kotlin {
    jvm { library() }
    js(IR) { library() }
    nativeTargets(false)
    sourceSets {
        val commonTest by getting {
            dependencies {
                api(asoft.expect.core)
            }
        }
    }
}

aSoftOSSLibrary(
    version = asoft.versions.color.get(),
    description = "A platform agnostic color library"
)
