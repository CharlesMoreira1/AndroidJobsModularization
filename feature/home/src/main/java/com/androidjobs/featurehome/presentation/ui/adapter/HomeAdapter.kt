package com.androidjobs.featurehome.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidjobs.featurehome.R
import com.androidjobs.network.model.entity.Job
import kotlinx.android.synthetic.main.item_jobs_home.view.*

class HomeAdapter :
    RecyclerView.Adapter<HomeAdapter.ItemViewHolder>() {

    private var listJobs = ArrayList<Job>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ItemViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_jobs_home, p0, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = listJobs.size

    override fun onBindViewHolder(holder: ItemViewHolder, p1: Int) {

        val dataItem = listJobs[p1]
        holder.bindView(dataItem)
    }

    fun addList(listPullRequest: List<Job>) {
        this.listJobs.clear()
        this.listJobs.addAll(listPullRequest)
        notifyDataSetChanged()
    }

    class ItemViewHolder(private val view: View):
        RecyclerView.ViewHolder(view) {

        private val textPlatform: TextView = view.text_platform
        private val textCountry: TextView = view.text_country

        fun bindView(job: Job) = with(view) {
            textPlatform.text = job.title
            textCountry.text = job.country
        }
    }
}