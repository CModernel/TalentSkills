package com.example.talent_project.data.model

class TATalentosAccionesProvider {
    companion object {
        var listTATalentosAcciones:List<TATalentosAcciones> = emptyList()

        fun getTATalentosAcciones(): List<TATalentosAcciones>{
            return listTATalentosAcciones
        }

        fun getTATalentoAccionByTalento(idTalento: Int): List<TATalentosAcciones>?{
            return try {
                listTATalentosAcciones.filter { it.idtalento == idTalento }
            } catch (e: NoSuchElementException){
                null
            }
        }
    }
}
