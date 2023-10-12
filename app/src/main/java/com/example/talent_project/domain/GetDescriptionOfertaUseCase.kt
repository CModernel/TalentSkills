package com.example.talent_project.domain

import androidx.core.text.HtmlCompat
import com.example.talent_project.data.MonedaRepository
import com.example.talent_project.data.OfertaRepository
import com.example.talent_project.data.PaisRepository
import com.example.talent_project.data.TalentoCostoRepository
import com.example.talent_project.data.model.TAMoneda
import com.example.talent_project.data.model.TAPais
import com.example.talent_project.data.model.TATalentosCosto
import com.example.talent_project.ui.view.adapters.OfferDescription
import java.text.DecimalFormat


class GetDescriptionOfertaUseCase constructor(private val ofertaRepository: OfertaRepository,
                                  private val paisRepository: PaisRepository,
                                  private val monedaRepository: MonedaRepository,
                                  private val talentoCostoRepository: TalentoCostoRepository,
) {
    suspend operator fun invoke() :  MutableList<OfferDescription>{
        var newList = mutableListOf<OfferDescription>()
        ofertaRepository.getOfertas().forEach {
            val description = it.descripcion
            val pais: TAPais? = paisRepository.getPais(it.idpais)
            val moneda: TAMoneda? = pais?.let { it1 -> monedaRepository.getMoneda(it1.idmoneda) }
            val talentoCosto: TATalentosCosto? = talentoCostoRepository.getTalentoCostoByPais(it.idpais)

            var costo = (talentoCosto?.costo ?: 0).toDouble() * it.numerotalentos
            costo -= ((costo / 100) * it.descuento)
            try {
                val df = DecimalFormat("#.##")
                costo = df.format(costo).toDouble()
            } catch (e: Exception) {

            }

            val descriptionSpanned = HtmlCompat.fromHtml(description + " <b> ${moneda?.moneda ?: "$"}" +
                    "$costo ${moneda?.clave}</b>", HtmlCompat.FROM_HTML_MODE_LEGACY)

            newList.add(OfferDescription(it, descriptionSpanned, false))
        }
        return newList
    }
}