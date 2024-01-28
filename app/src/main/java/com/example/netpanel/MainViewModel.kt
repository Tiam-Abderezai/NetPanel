package com.example.netpanel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.netpanel.network.NetworkApiImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val networkApiImpl: NetworkApiImpl,
) : ViewModel() {
    init {
        viewModelScope.launch {
            val data = networkApiImpl.getVLANs().data
            Log.d("TAG", "SHOW NETWORK DATA: $data")
        }
    }
}
