package com.androidjobs.featurestart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_click_home.setOnClickListener {
           findNavController().navigate(R.id.action_start_fragment_to_home_fragment)
        }

        button_click_info.setOnClickListener {
            findNavController().navigate(R.id.action_start_fragment_to_info_fragment)
        }
    }
}
