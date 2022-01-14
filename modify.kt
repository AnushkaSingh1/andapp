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




network/MarsApiService.kt

package com.example.android.marsphotos.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
   "https://android-kotlin-fun-mars-server.appspot.com"

/**
* Build the Moshi object with Kotlin adapter factory that Retrofit will be using.
*/
private val moshi = Moshi.Builder()
   .add(KotlinJsonAdapterFactory())
   .build()

/**
* The Retrofit object with the Moshi converter.
*/
private val retrofit = Retrofit.Builder()
   .addConverterFactory(MoshiConverterFactory.create(moshi))
   .baseUrl(BASE_URL)
   .build()

/**
* A public interface that exposes the [getPhotos] method
*/
interface MarsApiService {
   /**
    * Returns a [List] of [MarsPhoto] and this method can be called from a Coroutine.
    * The @GET annotation indicates that the "photos" endpoint will be requested with the GET
    * HTTP method
    */
   @GET("photos")
   suspend fun getPhotos() : List<MarsPhoto>
}

/**
* A public Api object that exposes the lazy-initialized Retrofit service
*/
object MarsApi {
   val retrofitService: MarsApiService by lazy { retrofit.create(MarsApiService::class.java) }
}
