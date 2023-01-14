package me.escoffier.workshop.supes;

import java.util.Random;

public class Villain {

    public int id;
    public String name;
    public String otherName;
    public int level;
    public String picture;

    public String powers;

    @Override
    public String toString() {
        return "Villain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", otherName='" + otherName + '\'' +
                ", level=" + level +
                ", picture='" + picture + '\'' +
                ", powers='" + powers + '\'' +
                '}';
    }
}
