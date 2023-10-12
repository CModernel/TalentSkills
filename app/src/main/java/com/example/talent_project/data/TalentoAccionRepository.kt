package com.example.talent_project.data

import com.example.talent_project.data.model.*
import com.example.talent_project.data.network.PreguntaService
import com.example.talent_project.data.network.RespuestaService
import com.example.talent_project.data.network.TalentoAccionService
import com.example.talent_project.data.network.TalentoCostoService

class TalentoAccionRepository {
    val api = TalentoAccionService()

    init {
        fetchTalentoAccion()
    }

    fun fetchTalentoAccion(){
        val response = api.getTalentosAcciones()
        TATalentosAccionesProvider.listTATalentosAcciones = response
    }

    fun getTalentoAccion(): List<TATalentosAcciones> = TATalentosAccionesProvider.getTATalentosAcciones()

    fun getTalentoAccionByTalentoId(talentoId: Int): List<TATalentosAcciones>? = TATalentosAccionesProvider.getTATalentoAccionByTalento(talentoId)
}