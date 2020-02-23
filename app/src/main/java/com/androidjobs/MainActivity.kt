package com.androidjobs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidjobs.core.helper.startFragment
import com.androidjobs.featurehome.presentation.ui.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.startFragment<HomeFragment>(R.id.view_pager)
    }
}
