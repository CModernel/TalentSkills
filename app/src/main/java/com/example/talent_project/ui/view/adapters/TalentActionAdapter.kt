package com.example.talent_project.ui.view.adapters

import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.forEach
import androidx.recyclerview.widget.RecyclerView
import com.example.talent_project.R
import com.example.talent_project.data.model.TAOfertas
import com.example.talent_project.data.model.TAPregunta
import com.example.talent_project.data.model.TARespuesta
import com.example.talent_project.data.model.TATalentosAcciones

class TalentActionAdapter(private val actionList: List<TATalentosAcciones>): RecyclerView.Adapter<TalentActionAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_action, parent, false)
        return TalentActionAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val qa = actionList[position]
        holder.bind(qa)
    }

    override fun getItemCount(): Int = actionList.size

    class ViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        private val text = view.findViewById<TextView>(R.id.ia_tv)

        fun bind(tAction: TATalentosAcciones) {
            text.text = tAction.descripcion
        }
    }
}