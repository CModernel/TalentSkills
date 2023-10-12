package com.example.talent_project.data.model

class TAPaisProvider {
    companion object {
        var listPais:List<TAPais> = emptyList()

        fun getTAPaises(): List<TAPais>{
            return listPais
        }

        fun getTAPais(idPais: Int): TAPais?{
            return try {
                listPais.first { it.idpais == idPais }
            } catch (e: NoSuchElementException){
                null
            }
        }

    }
}