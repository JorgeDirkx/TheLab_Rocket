package com.jorgedirkx;

public class Main {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket(40,50);

        Person person1 = new Person("Jorge", 38);

        //or

        Person person2 = new Person();

        person2.setAge(38);
        person2.setName("Jorge");

        rocket1.setPilot(person1);
        rocket1.setPayload(200);

        System.out.println("Rocket 1"+ rocket1.calculateDistance());
        rocket1.liftOff();
    }
}
