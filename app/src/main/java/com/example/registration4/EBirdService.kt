package com.example.registration4

import retrofit2.http.GET
import retrofit2.http.Query

interface EBirdService {
    @GET("v2/ref/hotspot/geo")
    suspend fun getNearbyHotspots(
        @Query("lat") latitude: Double,
        @Query("lng") longitude: Double,
        @Query("back") backDays: Int,
        @Query("dist") searchRadius: Int,
        @Query("fmt") format: String,
        @Query("apiKey") apiKey: String
    ): retrofit2.Response<List<Hotspot>> // Change the return type
}