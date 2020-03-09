package com.androidjobs.featurehome.presentation.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidjobs.featurehome.R
import com.androidjobs.core.helper.observeResource
import com.androidjobs.featurehome.presentation.ui.adapter.HomeAdapter
import com.androidjobs.featurehome.presentation.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment: Fragment() {

    private val viewModel by viewModel<HomeViewModel>()

    private val homeAdapter by lazy {
        HomeAdapter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        iniUi()
        swipeRefresh()
    }

    private fun initViewModel() {
        viewModel.getListJobs().observeResource(viewLifecycleOwner,
            onSuccess = {
                homeAdapter.addList(it)
            },
            onError = {
               toastLong("Error")
            },
            onLoading = {
                toastLong("Loading")
            })
    }

    private fun iniUi() {
        with(recycler_home) {
            this.adapter = homeAdapter
            val linearLayoutManager = LinearLayoutManager(this@HomeFragment.context)
            this.layoutManager = linearLayoutManager
        }
    }

    private fun swipeRefresh() {
        swipe_refresh.setOnRefreshListener {
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(1000)
                viewModel.refreshViewModel()
                swipe_refresh.isRefreshing = false
            }
        }
    }

    private fun toastLong(message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}