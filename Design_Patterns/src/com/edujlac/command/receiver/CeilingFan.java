package com.edujlac.command.receiver;

public class CeilingFan {

    private String location;
    public enum Status{
        HIGH,
        MEDIUM,
        LOW,
        OFF
    }
    private Status speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = Status.OFF;
    }

    public void high() {
        System.out.println("Set speed to high.");
        this.speed = Status.HIGH;
    }

    public void medium() {
        System.out.println("Set speed to medium.");
        this.speed = Status.MEDIUM;
    }

    public void low() {
        System.out.println("Set speed to low.");
        this.speed = Status.LOW;
    }

    public void off() {
        System.out.println("Ceiling Fan turned off.");
        this.speed = Status.OFF;
    }

    public Status getSpeed() {
        return speed;
    }

    public String getLocation() {
        return location;
    }
}


