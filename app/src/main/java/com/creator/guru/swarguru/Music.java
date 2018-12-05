package com.creator.guru.swarguru;

public class Music {

    private String mSongName;

    private String mSongArtist;

    private int mImageResourceId ;

    //private int mImageResourceId1 ;

    public Music(String songName, int ImageResourceId, String songArtist/**, int imageResourceId1**/){

        mSongName = songName;
        mImageResourceId = ImageResourceId;
        mSongArtist = songArtist;
        //mImageResourceId1 = imageResourceId1;
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

   /** public int getImageResourceId1() {

        return mImageResourceId1;
    }**/

}
