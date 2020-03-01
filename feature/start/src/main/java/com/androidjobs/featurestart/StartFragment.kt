package com.androidjobs.featurestart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.androidjobs.navigation.NavigationStartFeature
import com.androidjobs.navigation.setup.startNavigation
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

        button_click.setOnClickListener {
            startNavigation<NavigationStartFeature>().actionStartFragmentToHomeFragment()
        }
    }
}
