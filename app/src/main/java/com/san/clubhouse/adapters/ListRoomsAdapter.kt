package com.san.clubhouse.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.san.clubhouse.ClubHouseRoom
import com.san.clubhouse.R
import kotlinx.android.synthetic.main.room_list_item.view.*

class ListRoomsAdapter(
    private val list: List<ListRooms>,
    private val context: Context
)  : RecyclerView.Adapter<RoomListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RoomListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RoomListViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: RoomListViewHolder, position: Int) {
        val roomList: ListRooms = list[position]
        holder.bind(roomList, context)
    }

    override fun getItemCount(): Int = list.size

}

class RoomListViewHolder(inflater: LayoutInflater, parent: ViewGroup) :

    RecyclerView.ViewHolder(inflater.inflate(R.layout.room_list_item, parent, false)) {

    @SuppressLint("ResourceAsColor")
    fun bind(roomList: ListRooms, context: Context) {
        itemView.list_item_room.setOnClickListener {
            context.startActivity(Intent(context, ClubHouseRoom::class.java))
        }
    }

}

data class ListRooms(
    var room_name: String = ""
)

data class ListSpeakers(
    var speaker_name: String = ""
)

data class ListListener(
    var Listener_name: String = ""
)