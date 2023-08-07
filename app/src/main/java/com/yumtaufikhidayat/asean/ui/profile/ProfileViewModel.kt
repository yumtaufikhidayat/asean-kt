package com.yumtaufikhidayat.asean.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yumtaufikhidayat.asean.data.repository.AseanRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val repository: AseanRepository
) : ViewModel() {

    fun insertProfile() = viewModelScope.launch {
        repository.insertProfile()
    }

    fun getProfile() = repository.getProfile()
}