package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAPais

class PaisService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()
    fun getPaises(): List<TAPais> {
        return listOf(
            TAPais(
                idpais = 1,
                pais = "Australia",
                idmoneda = 1
            )
        )
    }
}