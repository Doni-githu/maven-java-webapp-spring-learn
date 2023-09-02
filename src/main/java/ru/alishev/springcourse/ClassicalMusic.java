package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void mounted() {
        System.out.println("Mounted");
    }

    public void unmounted() {
        System.out.println("UnMounted");
    }

    public String getSong() {
        return "Hungarion Rhapsody";
    }
}
