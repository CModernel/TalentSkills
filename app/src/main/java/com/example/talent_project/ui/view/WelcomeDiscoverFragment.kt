package com.example.talent_project.ui.view

import android.app.ActionBar
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.talent_project.R
import com.example.talent_project.databinding.FragmentWelcomeDiscoverBinding
import com.google.android.material.imageview.ShapeableImageView


class WelcomeDiscoverFragment : Fragment() {

    private var _binding: FragmentWelcomeDiscoverBinding? = null
    private val binding get() = _binding!!

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentWelcomeDiscoverBinding.inflate(inflater, container, false)
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        showWelcomeDialog()
        binding.ftoBtnStart.setOnClickListener{ navController.navigate(R.id.fragmentHelpDiscover) }
        binding.fwdBtnHelp.setOnClickListener{ showHelpDialog() }
        binding.fwdBtnBack.setOnClickListener{ navController.navigate(R.id.fragmentSelectNavigation) }
    }

    fun showWelcomeDialog(){
        val dialogBuilder = AlertDialog.Builder(requireContext())
        val layoutView: View = layoutInflater.inflate(R.layout.dialog_welcome_layout, null)
        val dialogButton: Button = layoutView.findViewById(R.id.dwl_btn_accept)
        dialogBuilder.setView(layoutView)
        val alertDialog = dialogBuilder.create()
        alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogButton.setOnClickListener(View.OnClickListener { alertDialog.dismiss() })

        alertDialog.show()
    }

    fun showHelpDialog(){
        val dialogBuilder = AlertDialog.Builder(requireContext())
        val layoutView: View = layoutInflater.inflate(R.layout.dialog_tips_layout, null)
        val dialogButton: ShapeableImageView = layoutView.findViewById(R.id.dtl_btn_back)
        dialogBuilder.setView(layoutView)
        val alertDialog = dialogBuilder.create()
        val w = alertDialog.window
        w?.setGravity(Gravity.BOTTOM)
        w?.setLayout(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT)
        w?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogButton.setOnClickListener(View.OnClickListener { alertDialog.dismiss() })

        alertDialog.show()
    }
}