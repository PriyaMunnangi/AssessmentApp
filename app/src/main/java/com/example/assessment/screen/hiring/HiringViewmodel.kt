package com.example.assessment.screen.hiring

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assessment.data.models.Hiring
import com.example.assessment.data.repository.HiringRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiringViewmodel @Inject constructor(
 private val hiringRepository: HiringRepository
) : ViewModel() {

    private val _hiringState = mutableStateMapOf<Int, List<Hiring>>()


    val hiringState
        get() = _hiringState
    init {
        getHiringData()
    }

    fun getHiringData() {
        viewModelScope.launch {
            val response = hiringRepository.getHiringResponse()
            if(response.isSuccessful) {
                _hiringState.putAll(
                    filterDate(response.body()?: emptyList())
                )
            }
        }
    }

    fun filterDate(hiringList: List<Hiring>): Map<Int, List<Hiring>> {
        return hiringList.filter {
            !it.name.isNullOrEmpty()
        }.groupBy { it.listId }
    }
}