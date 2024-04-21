object Version{
    const val coreVersion="1.7.0"
    const val appCompatVersion="1.6.1"
    const val materialVersion="1.11.0"
    const val constraintVersion="2.1.4"

    const val testImplJunit = "4.13.2"
    const val androidTestImplJunit = "1.1.5"
    const val androidTestEspresso = "3.5.1"
}

object Deps{
    const val core="androidx.core:core-ktx:${Version.coreVersion}"
    const val appCompat="androidx.appcompat:appcompat:${Version.appCompatVersion}"
    const val materialCompat="com.google.android.material:material:${Version.materialVersion}"
    const val constraint="androidx.constraintlayout:constraintlayout:${Version.constraintVersion}"
}

object DaggerHilt{

}

object TestImplementation{
    const val testImplJunit = "junit:junit:${Version.testImplJunit}"
}

object AndroidTestImplementation{
    const val androidTestImplJunit = "androidx.test.ext:junit:${Version.androidTestImplJunit}"
    const val androidTestEspresso = "androidx.test.espresso:espresso-core:${Version.androidTestEspresso}"
}