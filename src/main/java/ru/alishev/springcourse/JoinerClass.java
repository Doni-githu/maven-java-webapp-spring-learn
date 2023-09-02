package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class JoinerClass {
    private List<String> list = new ArrayList<>();

    public JoinerClass(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString(){
        StringJoiner stringJoiner = new StringJoiner(" , ");
        for (String string : list) {
            stringJoiner.add(string);
        }
        return stringJoiner.toString();
    }
}
