package com.example.talent_project.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.talent_project.R
import com.example.talent_project.databinding.FragmentTalentOfferBinding
import com.example.talent_project.ui.view.adapters.TalentOfferAdapter
import com.example.talent_project.ui.viewmodel.TalentOfferViewModel


class TalentOfferFragment : Fragment() {
    private var _binding: FragmentTalentOfferBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: TalentOfferViewModel

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTalentOfferBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        // ViewModel
        viewModel = ViewModelProvider(this)[TalentOfferViewModel::class.java]

        viewModel.listOfertasDescription.observe(viewLifecycleOwner, Observer {
            binding.ftoRvOfferList.adapter = TalentOfferAdapter(it)
        })

        viewModel.fetchListOfertasWithDescription()

        // Button setup
        setupButtons()
    }

    fun setupButtons(){
        with(binding){
            ftoBtnStart.setOnClickListener{
                if(viewModel.hasItemSelected())
                    navController.navigate(R.id.fragmentLoadingOffer) }
            ftoBtnClose.setOnClickListener{ navController.navigate(R.id.fragmentSelectNavigation) }
        }
    }
}