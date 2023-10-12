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

class TalentDetailQuestionAdapter(private val queryList: List<QuestionAnswer>): RecyclerView.Adapter<TalentDetailQuestionAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_question, parent, false)
        return TalentDetailQuestionAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val qa = queryList[position]
        holder.bind(qa)
    }

    override fun getItemCount(): Int = queryList.size

    class ViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        private val number = view.findViewById<TextView>(R.id.iq_number)
        private val title = view.findViewById<TextView>(R.id.iq_title)
        private val answerFrameLayout = view.findViewById<FrameLayout>(R.id.iq_answers_frame)
        private val answerTextView = view.findViewById<TextView>(R.id.iq_tv_answers)
        private val arrowImageView = view.findViewById<ImageView>(R.id.iq_iv_arrow)
        private val questionConstraintLayout = view.findViewById<ConstraintLayout>(R.id.iq_cl_question)

        private var isExpanded = false

        fun bind(qa: QuestionAnswer) {
            number.text = qa.pregunta.numpregunta.toString() + ". "
            title.text = qa.pregunta.descripcion

            setRespuestas(qa)
            setClick()
        }

        private fun setRespuestas(qa: QuestionAnswer){
            var mRespuestas = qa.respuesta
            if(!mRespuestas.isNullOrEmpty() && mRespuestas.size > 0){
                mRespuestas.forEach {
                    if(answerTextView.text.isNotEmpty())
                        answerTextView.text = answerTextView.text.toString() + "\n"

                    answerTextView.text = answerTextView.text.toString() + it.numrespuesta.toString() + ". " + it.descripcion
                }
            }
        }

        private fun setClick(){
            questionConstraintLayout.setOnClickListener{
                if(isExpanded){
                    answerFrameLayout.visibility = View.GONE
                    arrowImageView.setImageResource(R.mipmap.ic_down_arrow)
                } else {
                    answerFrameLayout.visibility = View.VISIBLE
                    arrowImageView.setImageResource(R.mipmap.ic_up_arrow)
                }
                isExpanded = !isExpanded
            }
        }
    }
}

data class QuestionAnswer(
    var pregunta: TAPregunta,
    var respuesta: List<TARespuesta>?
)
