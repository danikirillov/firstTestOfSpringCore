package ru.yandex.danikirillov;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Реализация задания(примера работы со spring и maven) из курса:
 * https://www.youtube.com/playlist?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ
 * */
public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playSong();
        }
    }
}
