package com.san.clubhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager
import com.san.clubhouse.adapters.ListListenersAdapter

import com.san.clubhouse.adapters.ListSpeakers;
import com.san.clubhouse.adapters.ListSpeakersAdapter
import kotlinx.android.synthetic.main.activity_club_house_room.*

class ClubHouseRoom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_house_room)

        val speakersAdapter = ListSpeakersAdapter(Utils.roomSpeakerList(), this)

        speakers_recycler_view?.layoutManager = GridLayoutManager(this, 3)
        speakers_recycler_view?.adapter = speakersAdapter

        val listenerFollowedByAdapter = ListListenersAdapter(Utils.roomListenerList(), this)

        listener_followed_by_speaker_recycler_View?.layoutManager = GridLayoutManager(this, 4)
        listener_followed_by_speaker_recycler_View?.adapter = listenerFollowedByAdapter

        val listenerAdapter = ListListenersAdapter(Utils.roomListenerList(), this)

        listener_recycler_View?.layoutManager = GridLayoutManager(this, 4)
        listener_recycler_View?.adapter = listenerAdapter
    }

}