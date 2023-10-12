package com.example.talent_project.data.model

class TAOfertasProvider {
    companion object {
        var listOfertas:List<TAOfertas> = emptyList()
        fun getTAOfertas(): List<TAOfertas>{
            return listOfertas.sortedByDescending { it.numerotalentos }
        }
    }
}