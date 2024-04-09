package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



//        Music rockMusic = context.getBean("rockMusic",Music.class);
//        Music classikMusic = context.getBean("classicalMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);
//        MusicPlayer musicPlayer1 = new MusicPlayer(classikMusic);
//        musicPlayer.playMusic();
//        musicPlayer1.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1);



        context.close();

    }
}
