package com.example.talent_project.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.talent_project.data.MonedaRepository
import com.example.talent_project.data.OfertaRepository
import com.example.talent_project.data.PaisRepository
import com.example.talent_project.data.TalentoCostoRepository
import com.example.talent_project.data.model.*
import com.example.talent_project.domain.GetDescriptionOfertaUseCase
import com.example.talent_project.domain.GetOfertaUseCase
import com.example.talent_project.ui.view.adapters.OfferDescription
import kotlinx.coroutines.launch

class TalentOfferViewModel : ViewModel() {

    // Properties
    val listOfertas = MutableLiveData<List<TAOfertas>>()
    val listOfertasDescription = MutableLiveData<MutableList<OfferDescription>>()
    var getOfertaUseCase = GetOfertaUseCase(OfertaRepository())
    var getDescriptionOfertaUseCase = GetDescriptionOfertaUseCase(
        OfertaRepository(), PaisRepository(), MonedaRepository(), TalentoCostoRepository()
    )

    fun fetchListOfertas(){
        viewModelScope.launch{
            val result = getOfertaUseCase()

            if(!result.isNullOrEmpty()){
                listOfertas.postValue(result)
            }
        }
    }

    fun fetchListOfertasWithDescription(){
        viewModelScope.launch{
            val result = getDescriptionOfertaUseCase()

            if(!result.isNullOrEmpty()){
                listOfertasDescription.postValue(result)
            }
        }
    }

    fun hasItemSelected(): Boolean{
        return listOfertasDescription.value?.any { it.selected } ?: false
    }
}