package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // Music music = context.getBean("musicBean",ClassicalMusic.class);

       // MusicPlayer musicPlayer = new MusicPlayer(music);

        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comp = musicPlayer1 == musicPlayer2;
//        System.out.println(comp);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer2.getVolume());
//        System.out.println(musicPlayer1.getVolume());



//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());




//    musicPlayer.playMusicList();


        context.close();

    }
}
