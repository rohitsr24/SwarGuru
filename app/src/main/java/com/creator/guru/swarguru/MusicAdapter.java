package com.creator.guru.swarguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {


    public MusicAdapter(Context context, ArrayList<Music> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        Music currentSong = getItem(position);


        TextView nameTextView1 = listItemView.findViewById(R.id.songName);

        nameTextView1.setText(currentSong.getSongName());

        ImageView imageView1 = listItemView.findViewById(R.id.thumbnail);

        imageView1.setImageResource(currentSong.getImageResourceId());


        TextView nameTextView2 = listItemView.findViewById(R.id.songArtist);

        nameTextView2.setText(currentSong.getSongArtist());

        return listItemView;
    }
}
