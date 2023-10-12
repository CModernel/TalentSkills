package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TATalentosCosto

class TalentoCostoService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()
    fun getTalentosCostos(): List<TATalentosCosto> {
        return listOf<TATalentosCosto>(
            TATalentosCosto(
                idtalentocosto = 1,
                costo = 1.99,
                idpais = 1
            )
        )
    }
}