package com.yumtaufikhidayat.asean.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yumtaufikhidayat.asean.data.repository.AseanRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: AseanRepository
) : ViewModel() {

    init {
        insertCountry()
    }

    private fun insertCountry() = viewModelScope.launch {
        repository.insertCountry()
    }

    fun getAllCountries() = repository.getAllCountries()
}