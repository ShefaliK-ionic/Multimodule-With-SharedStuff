plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "com.shared_pref"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

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
    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion ="1.4.1"
    }
}

dependencies {
//    implementation(project:('buildSrc'))

//    implementation DaggerHilt.dagger
//            kapt DaggerHilt.dagger_kapt
//    implementation Deps.core
    implementation (Deps.core)
            implementation (Deps.appCompat)
            implementation (Deps.materialCompat)
            implementation (Deps.constraint)
            testImplementation (TestImplementation.testImplJunit)
            androidTestImplementation (AndroidTestImplementation.androidTestImplJunit)
            androidTestImplementation (AndroidTestImplementation.androidTestEspresso)

    implementation (DaggerHilt.dagger)
            kapt (DaggerHilt.dagger_kapt)

    implementation (Retrofit.retrofitGson)
//    implementation("androidx.core:core-ktx:1.10.1")
//    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation("com.google.android.material:material:1.11.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


//    kapt (DaggerHilt.dagger_kapt)
}