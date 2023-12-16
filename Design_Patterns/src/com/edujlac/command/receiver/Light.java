package com.edujlac.command.receiver;

public class Light {

    private final String room;

    public Light(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println("The light is on in the " + room);
    }

    public void off() {
        System.out.println("The light is off in the " + room);
    }
 }
