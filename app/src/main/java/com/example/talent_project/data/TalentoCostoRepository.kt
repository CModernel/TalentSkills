package com.example.talent_project.data

import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TAPaisProvider
import com.example.talent_project.data.model.TATalentosCosto
import com.example.talent_project.data.model.TATalentosCostoProvider
import com.example.talent_project.data.network.TalentoCostoService

class TalentoCostoRepository {
    val api = TalentoCostoService()

    init {
        fetchOfertas()
    }

    fun fetchOfertas(){
        val response = api.getTalentosCostos()
        TATalentosCostoProvider.listTalentosCosto = response
    }

    fun getTalentosCosto(): List<TATalentosCosto> = TATalentosCostoProvider.getTATalentosCosto()

    fun getTalentoCostoByPais(paisId: Int): TATalentosCosto? = TATalentosCostoProvider.getTATalentosCostoByPais(paisId)
}