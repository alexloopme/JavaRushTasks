package com.javarush.task.task25.task2515;

import java.util.ArrayList;

/**

 */

public class Space {

    public void run(){}

    public void draw() {}

    public void sleep(int ms) {}

    private int width;
    private int height;
    private SpaceShip ship;
    private ArrayList<Ufo> ufos = new ArrayList<>();
    private ArrayList<Rocket> rockets = new ArrayList<>();
    private ArrayList<Bomb> bombs = new ArrayList<>();
    public static Space game;

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setShip(SpaceShip ship) {

        this.ship = ship;
    }

    public static void main(String[] args) {

    }
}