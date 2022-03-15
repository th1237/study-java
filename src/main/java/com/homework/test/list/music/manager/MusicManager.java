package com.homework.test.list.music.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.homework.test.list.music.vo.Music;


public class MusicManager {
    private List<Music> musicList;

    public MusicManager() {
        musicList = new ArrayList<>();
        musicList.add(new Music("Mexican Fender","Weezer"));
        musicList.add(new Music("i","Kendrick Lamar"));
        musicList.add(new Music("Stan(ft.Dido)","Eminem"));

    }

    public List<Music> selectList(){
        return this.musicList;
    }

    public void addList(Music music) {
        musicList.add(music);
    }

    public void addAtZero(Music music) {
        musicList.add(0, music);
    }

    public boolean removeMusic(String title) {
        return false;
    }

    public boolean replaceMusic(Music oldMusic, Music newMusic) {
        Music music = null;
        for(int i = 0; i < musicList.size(); i++) {
            music = musicList.get(i);
            if(oldMusic.getTitle().equals(music.getTitle())
                    && oldMusic.getSinger().equals(music.getSinger())){
                musicList.remove(i);
                musicList.add(i, newMusic);
                return true;
            }
        }
        return false;
    }

    public List<Music> searchMusicByTitle(String title){
        List<Music> searchMusic = new ArrayList<>();
        Music music = null;
        for(int i = 0; i < musicList.size(); i++) {
            music = musicList.get(i);
            if(music.getTitle().contains(title)) {
                searchMusic.add(music);
            }
        }
        if(searchMusic.isEmpty()) {
            System.out.println("검색결과가 없습니다.");
        }
        else{
            for(Music m : searchMusic) {
                System.out.println(m);
            }
        }
        return searchMusic;
    }

    public List<Music> searchMusicBySinger(String singer){
        List<Music> searchMusic = new ArrayList<>();
        Music music = null;
        for(int i = 0; i < musicList.size(); i++) {
            music = musicList.get(i);
            if(music.getSinger().contains(singer)) {
                searchMusic.add(music);
            }
        }
        if(searchMusic.isEmpty()) {
            System.out.println("검색결과가 없습니다.");
        }
        else{
            for(Music m : searchMusic) {
                System.out.println(m);
            }
        }
        return searchMusic;
    }

    public void orderBy(Comparator<Music> reverseOrder) {
    }
}
