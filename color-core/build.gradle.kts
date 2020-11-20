plugins {
    id("com.android.library") version "4.1.0"
    kotlin("multiplatform") version "1.4.10"
    id("tz.co.asoft.library") version "0.0.7"
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
