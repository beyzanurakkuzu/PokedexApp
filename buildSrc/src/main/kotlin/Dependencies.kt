object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val coreKTX = "androidx.core:core-ktx:${Versions.coreKTXVersion}"
    const val jUnit = "junit:junit:${Versions.jUnitVersion}"

    const val dagger = "com.google.dagger:dagger:${Versions.daggerVersion}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.daggerVersion}"
    const val daggerAndroidSupport =
        "com.google.dagger:dagger-android-support:${Versions.daggerVersion}"
    const val daggerAndroidProcessor =
        "com.google.dagger:dagger-android-processor:${Versions.daggerVersion}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"

    const val navigationFragmentKTX =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUIKTX =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomWithCoroutines = "androidx.room:room-ktx:${Versions.roomVersion}"
    const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"

    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    const val lifecycleCommon =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val lifecycleLiveDataKTX =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"


}