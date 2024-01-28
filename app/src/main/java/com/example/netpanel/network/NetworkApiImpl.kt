package com.example.netpanel.network

import android.util.Log
import com.example.netpanel.network.NetworkResponse
import javax.inject.Inject

class NetworkApiImpl @Inject constructor(
    private val networkApi: NetworkApi,
) : NetworkRepository {

    override suspend fun getVLANs(): Resource<NetworkResponse> {
        return try {
            val response = networkApi.getVLANs()

//            logger.debug("getJourneys: ${response.raw()}")
            Log.d("", "SHOW NETWORK DATA message: ${response.message()}")
            if (response.isSuccessful) {
//                logger.debug("Locale.getDefault().language: ${Locale.getDefault().language}")
//                logger.debug("getJourneys: ${response.raw().body} ")

                response.body()?.let {
                    return@let Resource.success(it)
                } ?: Resource.error("An unknown error occurred", null)
            } else {
                Resource.error("An unknown error occurred", null)
            }
        } catch (e: Exception) {
            Resource.error("Couldn't reach the server. Check your internet connection", null)
            Resource.error("${e.message}", null)
        }
    }
}