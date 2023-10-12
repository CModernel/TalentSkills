package com.example.talent_project.domain

import androidx.core.text.HtmlCompat
import com.example.talent_project.data.*
import com.example.talent_project.data.model.TAMoneda
import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TATalentosCosto
import com.example.talent_project.ui.view.adapters.OfferDescription
import com.example.talent_project.ui.view.adapters.QuestionAnswer


class GetPreguntasRespuestasUseCase(private val preguntaRepository: PreguntaRepository,
                                    private val respuestaRepository: RespuestaRepository) {
    suspend operator fun invoke() :  List<QuestionAnswer>{
        var listQuestionsAnswers = mutableListOf<QuestionAnswer>()
        preguntaRepository.getPreguntas().forEach {
            listQuestionsAnswers.add(QuestionAnswer(it, respuestaRepository.getRespuestasByPreguntaId(it.idpregunta)))
        }
        return listQuestionsAnswers
    }
}