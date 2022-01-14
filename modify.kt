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

    
    
    
    network/MarsPhoto.kt

package com.example.android.marsphotos.network

import com.squareup.moshi.Json

/**
* This data class defines a Mars photo which includes an ID, and the image URL.
* The property names of this data class are used by Moshi to match the names of values in JSON.
*/
data class MarsPhoto(
   val id: String,
   @Json(name = "img_src") val imgSrcUrl: String
)
