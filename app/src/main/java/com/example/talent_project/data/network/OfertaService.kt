package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAOfertas

class OfertaService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()
    fun getOfertas(): List<TAOfertas> {
        return listOf(
            TAOfertas(
                idofertas = 1,
                descuento = 17,
                periodoinicio = "01/01/2022",
                periodofin = "31/12/2022",
                descripcion = "Discover your other talents for",
                idpais = 1,
                idestatusoferta = 1,
                numerotalentos = 4,
            ), TAOfertas(
                idofertas = 2,
                descuento = 0,
                periodoinicio = "01/01/2022",
                periodofin = "31/12/2022",
                descripcion = "Discover your other talents for",
                idpais = 1,
                idestatusoferta = 1,
                numerotalentos = 1,
            ), TAOfertas(
                idofertas = 3,
                descuento = 0,
                periodoinicio = "01/01/2022",
                periodofin = "31/12/2022",
                descripcion = "Discover your other talents for",
                idpais = 1,
                idestatusoferta = 1,
                numerotalentos = 2,
            ), TAOfertas(
                idofertas = 4,
                descuento = 0,
                periodoinicio = "01/01/2022",
                periodofin = "31/12/2022",
                descripcion = "Discover your other talents for",
                idpais = 1,
                idestatusoferta = 1,
                numerotalentos = 3,
            )
        )
    }
}