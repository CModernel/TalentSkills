package com.example.talent_project.domain

import androidx.core.text.HtmlCompat
import com.example.talent_project.data.*
import com.example.talent_project.data.model.TAMoneda
import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TATalentosAcciones
import com.example.talent_project.data.model.TATalentosCosto
import com.example.talent_project.ui.view.adapters.OfferDescription
import com.example.talent_project.ui.view.adapters.QuestionAnswer


class GetAccionesUseCase(private val talentoAccionRepository: TalentoAccionRepository) {
    suspend operator fun invoke() :  List<TATalentosAcciones>? = talentoAccionRepository.getTalentoAccionByTalentoId(1)
}