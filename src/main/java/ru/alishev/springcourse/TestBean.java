package ru.alishev.springcourse;

public class TestBean {
    private String name;

    public TestBean(String name){
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
