package com.example.talent_project.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.talent_project.R
import com.example.talent_project.databinding.FragmentSelectNavigationBinding
import com.example.talent_project.databinding.FragmentTalentDetailBinding
import com.example.talent_project.databinding.FragmentTalentOfferBinding
import com.example.talent_project.ui.view.adapters.TalentActionAdapter
import com.example.talent_project.ui.view.adapters.TalentDetailQuestionAdapter
import com.example.talent_project.ui.view.adapters.TalentOfferAdapter
import com.example.talent_project.ui.viewmodel.TalentDetailViewModel
import com.example.talent_project.ui.viewmodel.TalentOfferViewModel

class TalentDetailFragment : Fragment() {

    private var _binding: FragmentTalentDetailBinding? = null
    private val binding get() = _binding!!

    lateinit var navController: NavController

    private lateinit var viewModel: TalentDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTalentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        // ViewModel
        viewModel = ViewModelProvider(this)[TalentDetailViewModel::class.java]

        viewModel.listPreguntasRespuestas.observe(viewLifecycleOwner, Observer {
            binding.ftdRvQuestionList.adapter = TalentDetailQuestionAdapter(it)
        })

        viewModel.listAcciones.observe(viewLifecycleOwner, Observer {
            binding.ftdRvActionsList.adapter = TalentActionAdapter(it)
        })

        viewModel.fetchListAcciones()

        viewModel.fetchListPreguntasRespuestas()

        // Button setup
        setupButtons()
    }

    fun setupButtons(){
        with(binding){
            ftdBtnClose.setOnClickListener{ navController.navigate(R.id.fragmentSelectNavigation) }
        }
    }
}