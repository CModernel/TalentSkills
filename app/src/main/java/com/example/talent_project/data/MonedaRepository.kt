package com.example.talent_project.data

import com.example.talent_project.data.model.*
import com.example.talent_project.data.network.MonedaService

class MonedaRepository {
    val api = MonedaService()

    init {
        fetchMonedas()
    }

    fun fetchMonedas(){
        val response = api.getMoneda()
        TAMonedaProvider.listMoneda = response
    }

    fun getMonedas(): List<TAMoneda> = TAMonedaProvider.getTAMoneda()

    fun getMoneda(monedaId: Int): TAMoneda? = TAMonedaProvider.getTAMoneda(monedaId)

}