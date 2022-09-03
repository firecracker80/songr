package com.vinyl.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    public String title;
    public Integer length;
    public Integer trackNum;
    public Long albumId;

    @ManyToOne
    Albums albums;
    protected Song(){
    }

    public Song(String title, Integer length, Integer trackNum, Long albumId) {
        this.title = title;
        this.length = length;
        this.trackNum = trackNum;
        this.albumId = albumId;
    }

//    public Song(Song aSong) {
//        this.title = aSong.title;
//        this.length = aSong.length;
//        this.trackNum = aSong.trackNum;
//        this.albumId = aSong.albumId;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(Integer trackNum) {
        this.trackNum = trackNum;
    }

    public Long getAlbum() {
        return albumId;
    }

    public void setAlbum(Albums album) {
        this.albums = album;
    }
}


