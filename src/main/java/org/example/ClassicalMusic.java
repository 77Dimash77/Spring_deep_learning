package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music{


//    private ClassicalMusic(){
//
//    }
//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }

@PostConstruct
    public void doMyInit(){
        System.out.println("Doing my init");
    }
@PreDestroy
    public void doMyDestroy(){
        System.out.println("doing my dest");
    }

    @Override
    public String getSong() {
        return "Vengerian rapsodi";
    }

}
