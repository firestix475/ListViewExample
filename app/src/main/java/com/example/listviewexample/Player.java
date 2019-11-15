package com.example.listviewexample;

public class Player {
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable
        //Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
    
    private String name;
    private int age;
    private int imageResource;
    private int height;
    private int annualIncome;

    public Player(String name, int age, int imageResource, int height, int annualIncome) {
        this.name = name;
        this.age = age;
        this.imageResource = imageResource;
        this.height = height;
        this.annualIncome = annualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getHeight() {
        return height;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }
}
