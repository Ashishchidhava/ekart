plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.app.ekart"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.app.ekart"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)


    dependencies {
        // ---------------------- Jetpack Core ----------------------
        implementation("androidx.core:core-ktx:1.12.0") // Kotlin extensions for Android core APIs
        implementation("androidx.activity:activity-compose:1.8.2") // Compose support in Activity

        // ---------------------- Jetpack Compose ----------------------
        implementation("androidx.compose.ui:ui:1.5.3") // Core Compose UI
        implementation("androidx.compose.material3:material3:1.2.0") // Material 3 components
        implementation("androidx.compose.ui:ui-tooling-preview:1.5.3") // Preview support
        debugImplementation("androidx.compose.ui:ui-tooling:1.5.3") // Debug preview rendering
        implementation("androidx.navigation:navigation-compose:2.7.5") // Navigation with Compose

        // ---------------------- Lifecycle & ViewModel ----------------------
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // Lifecycle aware coroutines
        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2") // ViewModel in Compose

        // ---------------------- Room (Local Database) ----------------------
        implementation("androidx.room:room-runtime:2.6.1") // Room runtime
          ("androidx.room:room-compiler:2.6.1") // Annotation processor
        implementation("androidx.room:room-ktx:2.6.1") // Coroutines support for Room

        // ---------------------- DataStore (Preferences) ----------------------
        implementation("androidx.datastore:datastore-preferences:1.1.0") // Modern replacement for SharedPreferences

        // ---------------------- Networking (Retrofit + OkHttp) ----------------------
        implementation("com.squareup.retrofit2:retrofit:2.9.0") // Retrofit core
        implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Gson converter for Retrofit
        implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.11") // Logging for network calls



        // ---------------------- Coroutines ----------------------
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // Coroutines on Android

        // ---------------------- Image Loading ----------------------
        implementation("io.coil-kt:coil-compose:2.4.0") // Coil for Jetpack Compose
    }

}