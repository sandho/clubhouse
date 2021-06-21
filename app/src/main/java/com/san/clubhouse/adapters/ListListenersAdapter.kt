package com.san.clubhouse.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.san.clubhouse.R

class ListListenersAdapter(
    private val list: List<ListListener>,
    private val context: Context
)  : RecyclerView.Adapter<ListenerListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListenerListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListenerListViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ListenerListViewHolder, position: Int) {
        val roomList: ListListener = list[position]
        holder.bind(roomList, context)
    }

    override fun getItemCount(): Int = list.size

}

class ListenerListViewHolder(inflater: LayoutInflater, parent: ViewGroup) :

    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_room_listener_item, parent, false)) {

    @SuppressLint("ResourceAsColor")
    fun bind(roomList: ListListener, context: Context) {

    }

}