package com.creator.guru.swarguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Music> songs =new ArrayList<Music>();

        songs.add( new Music("Song1",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song2",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song3",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song4",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song5",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song5",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song6",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song7",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song8",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song9",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song10",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song11",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song12",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song13",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song14",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song15",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song16",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song17",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song18",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song19",R.mipmap.guitar,"abc"));
        songs.add( new Music("Song20",R.mipmap.guitar,"abc"));

        MusicAdapter adapter = new MusicAdapter(this,songs);

        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter(adapter);

        //final LinearLayout b1 = (LinearLayout)  findViewById(R.id.layout);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, PlayMusicActivity.class);
                startActivity(i);
            }
        });

    }
}
