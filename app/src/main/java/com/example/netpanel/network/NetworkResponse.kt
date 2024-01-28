package com.example.netpanel.network

data class NetworkResponse(
    val VLAN_Types: List<VLANType> = listOf(),
    val VLANs: List<VLAN> = listOf()
) {
    data class VLANType(
        val id: String = "",
        val mtu: String = "",
        val said: String = "",
        val type: String = ""
    )

    data class VLAN(
        val id: String = "",
        val name: String = "",
        val ports: List<String> = listOf(),
        val status: String = ""
    )
}