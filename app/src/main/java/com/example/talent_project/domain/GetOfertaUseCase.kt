package com.example.talent_project.domain

import com.example.talent_project.data.OfertaRepository

class GetOfertaUseCase(private val ofertaRepository : OfertaRepository) {
    suspend operator fun invoke() = ofertaRepository.getOfertas()
}