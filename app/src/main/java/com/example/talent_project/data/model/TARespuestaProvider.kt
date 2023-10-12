package com.example.talent_project.data.model

class TARespuestaProvider {
    companion object {
        var listRespuesta:List<TARespuesta> = emptyList()

        fun getAllTARespuestas(): List<TARespuesta>{
            return listRespuesta
        }

        fun getTARespuestaByRespuestaId(idRespuesta: Int): TARespuesta?{
            return try {
                listRespuesta.first { it.idrespuesta == idRespuesta }
            } catch (e: NoSuchElementException){
                null
            }
        }

        fun getTARespuestasByPreguntaId(idPregunta: Int): List<TARespuesta>?{
            return try {
                listRespuesta.filter { it.idpregunta == idPregunta }
            } catch (e: NoSuchElementException){
                null
            }
        }
    }
}