package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.musicList.add(music);   
    }

    public MusicPlayer() {
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer [musicList=" + musicList + ", name=" + name + ", volume=" + volume + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((musicList == null) ? 0 : musicList.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + volume;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MusicPlayer other = (MusicPlayer) obj;
        if (musicList == null) {
            if (other.musicList != null)
                return false;
        } else if (!musicList.equals(other.musicList))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (volume != other.volume)
            return false;
        return true;
    }
}
