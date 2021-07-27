package com.Revature;

public class Developer extends Company {
    private String game;
    private int devTime=0;

    public Developer(){
    }

    public Developer(String game, int devTime){
        this.game = game;
        this.devTime = devTime;
    }

    public void setGame(String game){
        this.game = game;
    }

    public String getGame(){
        return game;
    }

    public void setDevTime(int year){
        this.devTime= year;
    }

    public void getDevSummary(){
        if(this.getName() == null){
            System.out.println("This game company does not have a name.");
        }
        else if(game == null)
        {
            System.out.println(this.getName()+ " is not currently working on a game.");
        }
        else if(devTime == 0){
            System.out.println(this.getName()+" is developing "+game+".");
        }
        else{
            System.out.println(this.getName() + " has been developing " + game + " for " + devTime + " yrs.");
        }
    }

}
