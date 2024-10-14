package com.example.assessment.data.services

import com.example.assessment.data.models.Hiring
import retrofit2.Response
import retrofit2.http.GET

interface HiringApi {

    @GET("hiring.json")
    suspend fun getHiringData(): Response<List<Hiring>>
}