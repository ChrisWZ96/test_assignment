package com.Revature;

public class Videogame {

    public static void main(String[] args) {
        Developer dev = new Developer();
        Developer dev2 = new Developer("Pokemon Unite",1);
        dev.setName("Riot Games");
        dev.setGame("League of Legends");
        dev.setDevTime(12);
        dev.getDevSummary();
        dev2.getDevSummary();
    }
}
