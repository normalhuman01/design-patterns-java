package com.edujlac.command;

import com.edujlac.command.commands.GarageDoorOpenCommand;
import com.edujlac.command.commands.LightOnCommand;
import com.edujlac.command.invoker.SimpleRemoteControl;
import com.edujlac.command.receiver.GarageDoor;
import com.edujlac.command.receiver.Light;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light("Kitchen");
        LightOnCommand command = new LightOnCommand(light);
        simpleRemoteControl.setCommand(command).buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        simpleRemoteControl.setCommand(new GarageDoorOpenCommand(garageDoor)).buttonWasPressed();
    }
}
