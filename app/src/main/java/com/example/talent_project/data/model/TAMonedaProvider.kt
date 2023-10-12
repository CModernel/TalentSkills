package com.example.talent_project.data.model

class TAMonedaProvider {
    companion object {
        var listMoneda:List<TAMoneda> = emptyList()

        fun getTAMoneda(): List<TAMoneda>{
            return listMoneda
        }

        fun getTAMoneda(idMoneda: Int): TAMoneda?{
            return try {
                listMoneda.first { it.idmoneda == idMoneda }
            } catch (e: NoSuchElementException){
                null
            }
        }
    }
}