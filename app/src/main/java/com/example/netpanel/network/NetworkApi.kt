package com.example.netpanel.network

import com.example.netpanel.network.NetworkResponse
import retrofit2.Response
import retrofit2.http.GET
import java.util.*

interface NetworkApi {
    @GET("VLAN-mock.json")
    suspend fun getVLANs(
//        @Query("filter") filter: String,
//        @Query("page") page: Int,
//        @Query("pageSize") pageSize: Int,
    ): Response<NetworkResponse>
}
