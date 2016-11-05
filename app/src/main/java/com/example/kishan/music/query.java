package com.example.kishan.music;

/**
 * Created by kishan on 10/30/16.
 */

public class query {
    long id;
    String title;
    String artist;
    public query(long songID , String sTitle , String sartist){
        id=songID;
        title=sTitle;
        artist=sartist;

    }
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

}
