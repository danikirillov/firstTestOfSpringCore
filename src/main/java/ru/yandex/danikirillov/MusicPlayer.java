package ru.yandex.danikirillov;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playSong() {
        System.out.println("Playing: " + music.getSong());
    }
}
