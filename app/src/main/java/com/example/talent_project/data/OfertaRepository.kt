package com.example.talent_project.data

import com.example.talent_project.data.model.TAMonedaProvider
import com.example.talent_project.data.model.TAOfertas
import com.example.talent_project.data.model.TAOfertasProvider
import com.example.talent_project.data.network.OfertaService

class OfertaRepository {
    val api = OfertaService()

    init {
        fetchOfertas()
    }

    fun fetchOfertas(){
        val response = api.getOfertas()
        TAOfertasProvider.listOfertas = response
    }

    fun getOfertas(): List<TAOfertas> = TAOfertasProvider.getTAOfertas()
}