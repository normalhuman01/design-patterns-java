package com.edujlac.command.receiver;

public class Stereo {
    public void on() {
        System.out.println("Stereo turned on");
    }

    public void off() {
        System.out.println("Stereo turned off");
    }

    public void setCd() {
        System.out.println("Setting CD...");
    }

    public void setDvd() {
        System.out.println("Setting DVD...");
    }

    public void setRadio() {
        System.out.println("Setting radio...");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
