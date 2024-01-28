package com.example.netpanel.network

interface NetworkRepository {
    suspend fun getVLANs(): Resource<NetworkResponse>
}
