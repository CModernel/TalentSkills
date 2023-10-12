package com.example.talent_project.data.model

class TATalentosCostoProvider {
    companion object {
        var listTalentosCosto:List<TATalentosCosto> = emptyList()

        fun getTATalentosCosto(): List<TATalentosCosto>{
            return listTalentosCosto
        }

        fun getTATalentosCostoByPais(paisId: Int): TATalentosCosto?{
            return try {
                listTalentosCosto.first { it.idpais == paisId }
            } catch (e: NoSuchElementException){
                null
            }
        }
    }
}