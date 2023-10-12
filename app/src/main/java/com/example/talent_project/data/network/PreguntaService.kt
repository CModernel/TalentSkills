package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TAPregunta

class PreguntaService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()
    fun getPreguntas(): List<TAPregunta> {
        return listOf(
            TAPregunta(
                idpregunta = 1,
                numpregunta = 1,
                descripcion = "How do you establish strong relationships with others?"
            ), TAPregunta(
                idpregunta = 2,
                numpregunta = 2,
                descripcion = "How do you solve problems?"
            ), TAPregunta(
                idpregunta = 3,
                numpregunta = 3,
                descripcion = "What motivates you?"
            ), TAPregunta(
                idpregunta = 4,
                numpregunta = 4,
                descripcion = "What do you do faster and better than others?"
            )
        )
    }
}