package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAMoneda

class MonedaService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()

    fun getMoneda(): List<TAMoneda> {
        return listOf(
            TAMoneda(
                idmoneda = 1,
                moneda = "$",
                clave = "AUD"
            )
        )
    }
}