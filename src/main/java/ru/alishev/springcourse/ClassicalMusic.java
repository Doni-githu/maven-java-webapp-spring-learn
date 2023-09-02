package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public ClassicalMusic() {
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
