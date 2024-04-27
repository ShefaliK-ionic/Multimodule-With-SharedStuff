plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.common"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    composeOptions {
        kotlinCompilerExtensionVersion ="1.4.1"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Deps.core)
//    implementation("androidx.core:core-ktx:1.13.0")
    implementation (Deps.appCompat)
    implementation (Deps.materialCompat)
    implementation (Deps.constraint)
    testImplementation (TestImplementation.testImplJunit)
    androidTestImplementation (AndroidTestImplementation.androidTestImplJunit)
    androidTestImplementation (AndroidTestImplementation.androidTestEspresso)

}