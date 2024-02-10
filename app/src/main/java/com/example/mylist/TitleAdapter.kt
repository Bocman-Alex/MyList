package com.example.mylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mylist.databinding.ItemelementBinding

class TitleAdapter:RecyclerView.Adapter<TitleAdapter.TitleHolder>() {
    val titleList = ArrayList<TitleElementClass>()
    class TitleHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding =ItemelementBinding.bind(item )
        fun bind(title:TitleElementClass)= with(binding) {

            textIdView.text= title.titleId.toString()
            textNameView.text=title.titleName
            textEpisodesView.text= title.numbEpisodes.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemelement,parent,false)
        return TitleHolder(view)
    }


    override fun onBindViewHolder(holder: TitleHolder, position: Int) {
        holder.bind(titleList[position])
    }

    override fun getItemCount(): Int {
        return  titleList.size
    }

    fun addTitle (title: TitleElementClass){
        titleList.add(title)
        notifyDataSetChanged()
    }

}