package com.example.talent_project.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.talent_project.data.*
import com.example.talent_project.data.model.TAOfertas
import com.example.talent_project.data.model.TATalentosAcciones
import com.example.talent_project.domain.GetAccionesUseCase
import com.example.talent_project.domain.GetDescriptionOfertaUseCase
import com.example.talent_project.domain.GetOfertaUseCase
import com.example.talent_project.domain.GetPreguntasRespuestasUseCase
import com.example.talent_project.ui.view.adapters.OfferDescription
import com.example.talent_project.ui.view.adapters.QuestionAnswer
import kotlinx.coroutines.launch

class TalentDetailViewModel : ViewModel(){

    // Properties
    val listPreguntasRespuestas = MutableLiveData<List<QuestionAnswer>>()
    val listAcciones = MutableLiveData<List<TATalentosAcciones>>()

    var getPreguntasRespuestasUseCase = GetPreguntasRespuestasUseCase( PreguntaRepository(), RespuestaRepository() )
    var getAccionesUseCase = GetAccionesUseCase( TalentoAccionRepository() )

    // Dispatchers.IO is optimized to perform disk or network I/O outside of the main thread
    fun fetchListPreguntasRespuestas(){
        viewModelScope.launch{
            val result = getPreguntasRespuestasUseCase()

            if(!result.isNullOrEmpty()){
                listPreguntasRespuestas.postValue(result)
            }
        }
    }

    // Dispatchers.IO is optimized to perform disk or network I/O outside of the main thread
    fun fetchListAcciones(){
        viewModelScope.launch{
            val result = getAccionesUseCase()

            if(!result.isNullOrEmpty()){
                listAcciones.postValue(result!!)
            }
        }
    }
}