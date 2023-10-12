package com.example.talent_project.data

import com.example.talent_project.data.model.TAOfertasProvider
import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TAPaisProvider
import com.example.talent_project.data.network.PaisService

class PaisRepository {
    val api = PaisService()

    init {
        fetchOfertas()
    }

    fun fetchOfertas(){
        val response = api.getPaises()
        TAPaisProvider.listPais = response
    }

    fun getPaises(): List<TAPais> = TAPaisProvider.getTAPaises()

    fun getPais(paisId: Int): TAPais? = TAPaisProvider.getTAPais(paisId)
}