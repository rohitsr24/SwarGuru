package com.creator.guru.swarguru;

public class Music {

    private String mSongName;

    private String mSongArtist;

    private int mImageResourceId ;


    public Music(String songName, int ImageResourceId, String songArtist) {

        mSongName = songName;
        mImageResourceId = ImageResourceId;
        mSongArtist = songArtist;
    }

    public String getSongName(){

        return mSongName;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public String getSongArtist(){

        return mSongArtist;
    }

}
