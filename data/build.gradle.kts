plugins {
    id ("com.android.library")
    id ("kotlin-android")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-kapt")
}

android {
    namespace = "com.nohjunh.data"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        minSdk = SdkVersions.minSdk
        targetSdk = SdkVersions.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation (project (":domain"))

    implementation (KTX.CORE)
    implementation (AndroidX.APP_COMPAT)
    implementation (Google.MATERIAL)
    implementation (Firebase.FIREBASE_DATABASE_KTX)
    implementation (Firebase.FIREBASE_FIRESTORE_KTX)
    testImplementation (TestTool.JUNIT)
    androidTestImplementation (TestTool.ANDROID_X_JUNIT)
    androidTestImplementation (TestTool.ANDROID_X_ESPRESSO)

    // Timber
    implementation(Timber.TIMBER)

    // Retrofit
    implementation (Retrofit.RETROFIT)
    implementation (Retrofit.CONVERTER_GSON)
    implementation (Retrofit.CONVERTER_JAXB)

    //okHttp
    implementation (OkHttp.OKHTTP)
    implementation (OkHttp.LOGGING_INTERCEPTOR)

    //coroutines
    implementation (Coroutines.COROUTINES)
    implementation (Coroutines.COROUTINES_PLAY_SERVICES)

    // dager hilt
    implementation (DaggerHilt.DAGGER_HILT)
    kapt (DaggerHilt.DAGGER_HILT_COMPILER)
    kapt (DaggerHilt.DAGGER_HILT_ANDROIDX_COMPILER)
}