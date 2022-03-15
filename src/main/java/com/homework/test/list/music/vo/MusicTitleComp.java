package com.homework.test.list.music.vo;

import java.util.Comparator;

public class MusicTitleComp implements Comparator<Music>{

    @Override
    public int compare(Music o1, Music o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
