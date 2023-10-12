package com.example.talent_project.data.model

class TAPreguntaProvider {
    companion object {
        var listPregunta:List<TAPregunta> = emptyList()

        fun getTAPreguntas(): List<TAPregunta>{
            return listPregunta
        }

        fun getTAPregunta(idPregunta: Int): TAPregunta?{
            return try {
                listPregunta.first { it.idpregunta == idPregunta }
            } catch (e: NoSuchElementException){
                null
            }
        }
    }
}