plugins {
    id("com.android.library") version "4.1.0"
    kotlin("multiplatform") version "1.4.10"
    id("tz.co.asoft.library") version "0.0.7"
    id("io.codearte.nexus-staging") version "0.22.0"
    signing
}

object vers {
    const val asoft_color = "0.0.1"
}

kotlin {
    universalLib()
    sourceSets {
        val commonTest by getting {
            dependencies {
                api(asoft("test", "1.0.1"))
            }
        }
    }
}

aSoftLibrary(
    version = vers.asoft_color,
    description = "A platform agnostic color library"
)
