package com.example.talent_project.data.network

import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TAPregunta
import com.example.talent_project.data.model.TATalentosAcciones

class TalentoAccionService {
    // TODO: Retrofit
    // private val retrofit = RetrofitHelper.getRetrofit()
    fun getTalentosAcciones(): List<TATalentosAcciones> {
        return listOf(
            TATalentosAcciones(
                idtalento = 1,
                idaccion = 1,
                descripcion = "Be responsible for driving your team to win."
            ), TATalentosAcciones(
                idtalento = 1,
                idaccion = 2,
                descripcion = "Communicate what is important to succeed."
            ), TATalentosAcciones(
                idtalento = 1,
                idaccion = 3,
                descripcion = "Identify how your team compares to the competitors."
            ), TATalentosAcciones(
                idtalento = 1,
                idaccion = 4,
                descripcion = "Challenge your colleagues to win in goal execution."
            ), TATalentosAcciones(
                idtalento = 1,
                idaccion = 5,
                descripcion = "Identify how time can be saved to outperform others."
            )
        )
    }
}
