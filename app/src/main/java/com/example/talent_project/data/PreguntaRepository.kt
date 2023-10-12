package com.example.talent_project.data

import com.example.talent_project.data.model.*
import com.example.talent_project.data.network.PreguntaService
import com.example.talent_project.data.network.TalentoCostoService

class PreguntaRepository {
    val api = PreguntaService()

    init {
        fetchPreguntas()
    }

    fun fetchPreguntas(){
        val response = api.getPreguntas()
        TAPreguntaProvider.listPregunta = response
    }

    fun getPreguntas(): List<TAPregunta> = TAPreguntaProvider.getTAPreguntas()

    fun getPregunta(preguntaId: Int): TAPregunta? = TAPreguntaProvider.getTAPregunta(preguntaId)
}