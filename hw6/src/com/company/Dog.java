package com.company;

public class Dog extends Animal{
    int maxDogRuns = 500;
    int maxDogSwims = 10;

    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int lontitude) {
        if(lontitude < maxDogRuns){
            System.out.println(name + " пробежал " + lontitude +" м" );}
        else System.out.println("Пёс устал");
    }

    @Override
    public void swim(int lontitude) {
        if(lontitude < maxDogSwims){
            System.out.println(name + " проплыл " + lontitude +" м");}
        else System.out.println("Пёс устал");
    }
}
