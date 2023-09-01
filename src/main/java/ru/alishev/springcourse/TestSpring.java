package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer seondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean isEqual = firstMusicPlayer == seondMusicPlayer;
        firstMusicPlayer.setName("Some 1");
        seondMusicPlayer.setName("Some 2");
        System.out.println(firstMusicPlayer.getName());
        System.out.println(seondMusicPlayer.getName());
        context.close();
    }
}
