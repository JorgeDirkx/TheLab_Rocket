package com.jorgedirkx;

public class Rocket implements Launch{

    private int speed;
    private Tank fueltank = new Tank();
    private RocketEngine engine = new RocketEngine(50);
    private double payload;

    private Person pilot;

    public Person getPilot() {
        return pilot;
    }

    public void setPilot(Person pilot) {
        this.pilot = pilot;
    }
    //!!!
    public Rocket(int fuelIn, double payload){
        this.payload = payload;
        this.fueltank.setFuelCapacity(fuelIn);
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public void liftOff() {
        System.out.println("launch Rocket");
    }

    public double calculateDistance(){
        double temp = fueltank.getFuelLevel();
        return temp;
    }
}
