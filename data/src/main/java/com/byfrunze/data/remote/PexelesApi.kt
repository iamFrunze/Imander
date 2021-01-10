package com.byfrunze.data.remote

import com.byfrunze.data.PhotoPage
import com.byfrunze.data.dto.VideoPage
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import javax.annotation.Resource
import javax.annotation.Resources


interface PexelesApi {

    @Headers("Authorization: 563492ad6f91700001000001141224428d6c48d4baa22e4ea0e0e719")
    @GET("v1/curated")
    fun getCuredPhoto(): Observable<PhotoPage>

    @Headers("Authorization: 563492ad6f91700001000001141224428d6c48d4baa22e4ea0e0e719")
    @GET("v1/curated")
    fun getPopularVideo(): Observable<VideoPage>
}