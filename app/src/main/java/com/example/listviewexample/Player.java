package com.example.listviewexample;

public class Player {
    //Todo finish the class player
        //Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable
        //Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
    
    private String name;
    private int age;
    private int worth;
    private String mainSport;
    private int imageResource;
    private String webpage;

    public Player(String name, int age, int worth, String mainSport, int imageResource, String webpage) {
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.mainSport = mainSport;
        this.imageResource = imageResource;
        this.webpage = webpage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public void setMainSport (String mainSport) {
        this.mainSport = mainSport;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorth() {
        return worth;
    }

    public String getMainSport() {
        return mainSport;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getWebpage() {
        return webpage;
    }

}
