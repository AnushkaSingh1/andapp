build.gradle(Module : MarsPhotos.app)

dependencies {
    ...
    // Moshi
    implementation 'com.squareup.moshi:moshi-kotlin:1.9.3'

    // Retrofit with Moshi Converter
    implementation 'com.squareup.retrofit2:converter-moshi:2.9.0'

    ...
}



Manifests/AndroidManifest.xml

<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.android.marsphotos">

    <!-- In order for our app to access the Internet, we need to define this permission. -->
    <uses-permission android:name="android.permission.INTERNET" />

    <application
        ...
    </application>

</manifest>
