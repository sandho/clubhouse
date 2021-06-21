package com.san.clubhouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.san.clubhouse.adapters.ListListener
import com.san.clubhouse.adapters.ListRooms
import com.san.clubhouse.adapters.ListRoomsAdapter
import com.san.clubhouse.adapters.ListSpeakers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ListRoomsAdapter(Utils.roomList(), this)

        list_room_recycler_view?.layoutManager = LinearLayoutManager(this)
        list_room_recycler_view?.adapter = adapter
    }

}

class Utils {

    companion object {
        fun roomList(): ArrayList<ListRooms> {
            val rooms: ArrayList<ListRooms> = ArrayList()

            rooms.add(ListRooms("clubHouse Room 01"))
            rooms.add(ListRooms("clubHouse Room 02"))
            rooms.add(ListRooms("clubHouse Room 03"))
            rooms.add(ListRooms("clubHouse Room 04"))
            rooms.add(ListRooms("clubHouse Room 05"))
            rooms.add(ListRooms("clubHouse Room 06"))
            rooms.add(ListRooms("clubHouse Room 07"))
            rooms.add(ListRooms("clubHouse Room 08"))
            rooms.add(ListRooms("clubHouse Room 09"))
            rooms.add(ListRooms("clubHouse Room 10"))
            return rooms
        }

        fun roomSpeakerList(): ArrayList<ListSpeakers> {
            val rooms: ArrayList<ListSpeakers> = ArrayList()

            rooms.add(ListSpeakers("Speaker 01"))
            rooms.add(ListSpeakers("Speaker 02"))
            rooms.add(ListSpeakers("Speaker 03"))
            rooms.add(ListSpeakers("Speaker 04"))
            rooms.add(ListSpeakers("Speaker 05"))
            rooms.add(ListSpeakers("Speaker 06"))
            rooms.add(ListSpeakers("Speaker 07"))
            rooms.add(ListSpeakers("Speaker 08"))
            rooms.add(ListSpeakers("Speaker 09"))
            rooms.add(ListSpeakers("Speaker 10"))

            return rooms
        }

        fun roomListenerList(): ArrayList<ListListener> {
            val rooms: ArrayList<ListListener> = ArrayList()

            rooms.add(ListListener("Listener 01"))
            rooms.add(ListListener("Listener 02"))
            rooms.add(ListListener("Listener 03"))
            rooms.add(ListListener("Listener 04"))
            rooms.add(ListListener("Listener 05"))
            rooms.add(ListListener("Listener 06"))
            rooms.add(ListListener("Listener 07"))
            rooms.add(ListListener("Listener 08"))
            rooms.add(ListListener("Listener 09"))
            rooms.add(ListListener("Listener 10"))

            return rooms
        }
    }

}