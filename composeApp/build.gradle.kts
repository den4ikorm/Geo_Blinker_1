import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    id("com.android.application") version "8.1.0"
    id("org.jetbrains.kotlin.multiplatform") version "1.9.23"
    id("org.jetbrains.compose") version "1.6.1"
}

kotlin {
    androidTarget()
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                @OptIn(ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.activity:activity-compose:1.8.2")
            }
        }
    }
}

android {
    namespace = "org.example.geoblinker"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
}
