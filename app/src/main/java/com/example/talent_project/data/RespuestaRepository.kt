package com.example.talent_project.data

import com.example.talent_project.data.model.*
import com.example.talent_project.data.network.PreguntaService
import com.example.talent_project.data.network.RespuestaService
import com.example.talent_project.data.network.TalentoCostoService

class RespuestaRepository {
    val api = RespuestaService()

    init {
        fetchRespuestas()
    }

    fun fetchRespuestas(){
        val response = api.getRespuetas()
        TARespuestaProvider.listRespuesta = response
    }

    fun getRespuestas(): List<TARespuesta> = TARespuestaProvider.getAllTARespuestas()

    fun getRespuestasByPreguntaId(preguntaId: Int): List<TARespuesta>? = TARespuestaProvider.getTARespuestasByPreguntaId(preguntaId)
}