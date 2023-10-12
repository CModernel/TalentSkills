package com.example.talent_project.ui.view.adapters

import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.forEach
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.talent_project.R
import com.example.talent_project.data.model.TAOfertas

class TalentOfferAdapter(private var offersDescription: MutableList<OfferDescription>): Adapter<TalentOfferAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_talent, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val offerDesc = offersDescription[position]
        holder.bind(offerDesc, offersDescription)
        holder.setIsRecyclable(false)

        // Selects element
        if(offerDesc.selected)
            holder.itemSelected(holder.view, true)
    }

    override fun getItemCount(): Int = offersDescription.size

    class ViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        private val title = view.findViewById<TextView>(R.id.it_txt_title)
        private val description = view.findViewById<TextView>(R.id.it_txt_description)
        private val cLayout = view.findViewById<ConstraintLayout>(R.id.it_cl)
        private val discountTag = view.findViewById<View>(R.id.it_ll_discount_tag)

        fun bind(offer: OfferDescription, offersDescription: MutableList<OfferDescription> ) {
            with(offer.oferta){
                if(numerotalentos > 1)
                    title.text = "$numerotalentos talents"
                else
                    title.text = "$numerotalentos talent"

                description.text = offer.description

                // Discount tag
                if(descuento > 0){
                    discountTag.findViewById<TextView>(R.id.idt_tv_discount_tag).text = "Save " + descuento + "%"
                    discountTag.visibility = View.VISIBLE
                }
            }
            // OnClick Event
            cLayout.setOnClickListener{ v ->
                itemClicked(v)
                offersDescription.forEach { it.selected = false }
                offer.selected = true
            }
        }

        fun itemClicked(view: View){
            (view.parent as ViewGroup).forEach {
                itemSelected(it, false)
            }
            itemSelected(view, true)
        }

        fun itemSelected(item: View, selected: Boolean) {
            if(selected) {
                item.findViewById<LinearLayout>(R.id.it_ll).background =
                    ResourcesCompat.getDrawable(item.context.resources, R.drawable.combo_box_selector,null)
                item.findViewById<TextView>(R.id.it_txt_title).setTextColor(item.context.resources.getColor(R.color.pink, null))
            }else{
                item.findViewById<LinearLayout>(R.id.it_ll).background =
                    ResourcesCompat.getDrawable(item.context.resources, R.drawable.combo_box_selector_inactive, null)
                item.findViewById<TextView>(R.id.it_txt_title).setTextColor(item.context.resources.getColor(R.color.main_text_color, null))
            }

            item.findViewById<RadioButton>(R.id.it_rb).isChecked = selected
        }
    }
}

data class OfferDescription(
    var oferta: TAOfertas,
    var description: Spanned,
    var selected: Boolean
)