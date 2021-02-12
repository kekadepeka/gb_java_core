package com.company;

public class Cat extends Animal{
    int maxCatRuns = 200;

    public Cat(String name){
        super(name);
    }
    @Override
    public void run(int lontitude) {
        if(lontitude < maxCatRuns){
            System.out.println(name + " пробежал " + lontitude +" м" );
        }
        else System.out.println("Кот устал");

    }

    @Override
    public void swim(int lontitude) {
        System.out.println("Кот не умеет плавать");
    }
}
//System.out.println(name + " пробежал " + lontitude +" м" );
//System.out.println(name + " проплыл " + lontitude +" м");