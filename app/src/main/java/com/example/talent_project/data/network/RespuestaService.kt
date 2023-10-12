package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TAPregunta
import com.example.talent_project.data.model.TARespuesta

class RespuestaService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()
    fun getRespuetas(): List<TARespuesta> {
        return listOf(
            TARespuesta(
                idrespuesta = 1,
                numrespuesta = 1,
                descripcion = "I help them win ",
                idpregunta = 1
            ), TARespuesta(
                idrespuesta = 2,
                numrespuesta = 2,
                descripcion = "I convey the experience of victory",
                idpregunta = 1
            ), TARespuesta(
                idrespuesta = 3,
                numrespuesta = 3,
                descripcion = "I make them part of a champion team",
                idpregunta = 1
            ), TARespuesta(
                idrespuesta = 4,
                numrespuesta = 1,
                descripcion = "I compare myself with others and locate where we stand",
                idpregunta = 2
            ), TARespuesta(
                idrespuesta = 5,
                numrespuesta = 2,
                descripcion = "I identify what's important to win",
                idpregunta = 2
            ), TARespuesta(
                idrespuesta = 6,
                numrespuesta = 3,
                descripcion = "I move my team towards victory",
                idpregunta = 2
            ), TARespuesta(
                idrespuesta = 7,
                numrespuesta = 1,
                descripcion = "Winning, becoming a champion",
                idpregunta = 3
            ), TARespuesta(
                idrespuesta = 8,
                numrespuesta = 2,
                descripcion = "Competitions",
                idpregunta = 3
            ), TARespuesta(
                idrespuesta = 9,
                numrespuesta = 3,
                descripcion = "Being admired for my victories",
                idpregunta = 3
            ), TARespuesta(
                idrespuesta = 10,
                numrespuesta = 1,
                descripcion = "I identify what truly matters to win",
                idpregunta = 4
            ), TARespuesta(
                idrespuesta = 11,
                numrespuesta = 2,
                descripcion = "Finding the best way to surpass a record",
                idpregunta = 4
            ), TARespuesta(
                idrespuesta = 12,
                numrespuesta = 3,
                descripcion = "Helping my team beat our competitors",
                idpregunta = 4
            )
        )
    }
}
