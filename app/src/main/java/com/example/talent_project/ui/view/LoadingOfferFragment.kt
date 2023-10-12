package com.example.talent_project.ui.view

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.talent_project.R
import com.example.talent_project.databinding.FragmentLoadingOfferBinding


class LoadingOfferFragment : Fragment() {

    private var _binding: FragmentLoadingOfferBinding? = null

    private val binding get() = _binding!!

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoadingOfferBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)

        object : CountDownTimer(5000, 1000){
            override fun onFinish() {
                navController.navigate(R.id.fragmentSelectNavigation)
            }
            override fun onTick(millisUntilFinished: Long) { }
        }.start()
    }

}