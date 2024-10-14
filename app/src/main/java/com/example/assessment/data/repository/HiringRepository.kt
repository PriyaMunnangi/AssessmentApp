package com.example.assessment.data.repository

import com.example.assessment.data.models.Hiring
import retrofit2.Response

interface HiringRepository {

    suspend fun getHiringResponse() : Response<List<Hiring>>
}