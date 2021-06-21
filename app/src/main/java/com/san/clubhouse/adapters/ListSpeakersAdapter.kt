package com.san.clubhouse.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.san.clubhouse.R

class ListSpeakersAdapter(
    private val list: List<ListSpeakers>,
    private val context: Context
)  : RecyclerView.Adapter<SpeakersListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SpeakersListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SpeakersListViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: SpeakersListViewHolder, position: Int) {
        val roomList: ListSpeakers = list[position]
        holder.bind(roomList, context)
    }

    override fun getItemCount(): Int = list.size

}

class SpeakersListViewHolder(inflater: LayoutInflater, parent: ViewGroup) :

    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_room_speaker_item, parent, false)) {

    @SuppressLint("ResourceAsColor")
    fun bind(roomList: ListSpeakers, context: Context) {

    }

}