package com.example.assessment.data.repository

import com.example.assessment.data.models.Hiring
import com.example.assessment.data.services.HiringApi
import retrofit2.Response
import javax.inject.Inject


class HiringRepositoryImpl @Inject constructor(
   private val hiringApi: HiringApi
): HiringRepository {

   override suspend fun getHiringResponse() : Response<List<Hiring>> {
        return hiringApi.getHiringData()
    }

}