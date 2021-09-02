package com.example.android1_41;

public class Song {
    private String pos,title,singer,duration;

    public Song(String pos, String title, String singer, String duration) {
        this.pos = pos;
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
