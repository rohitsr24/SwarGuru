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

    // private int mColorResourceId;

    /**
     * Create a new {@link MusicAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of {@link Music}s to be displayed.
     **/
    public MusicAdapter(Context context, ArrayList<Music> songs) {
        super(context, 0, songs);
        //mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        Music currentSong = getItem(position);


        TextView nameTextView1 = (TextView) listItemView.findViewById(R.id.songName);

        nameTextView1.setText(currentSong.getSongName());

        ImageView imageView1 = listItemView.findViewById(R.id.thumbnail);

        imageView1.setImageResource(currentSong.getImageResourceId());


        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.songArtist);

        nameTextView2.setText(currentSong.getSongArtist());

        //ImageView imageView2 = listItemView.findViewById(R.id.song_overflow_button);

        //imageView2.setImageResource(currentSong.getImageResourceId1());

        return listItemView;
    }
}
