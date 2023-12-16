package com.edujlac.command;

import com.edujlac.command.commands.*;
import com.edujlac.command.invoker.RemoteControl;
import com.edujlac.command.receiver.CeilingFan;
import com.edujlac.command.receiver.Light;
import com.edujlac.command.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        remoteControl.onButtonPushed(3);
        remoteControl.offButtonPushed(3);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();

        /* **************** USING A MACRO COMMAND ************* */

        remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { lightOn, stereoOn };
        Command[] partyOff = { lightOff, stereoOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonPushed(0);
    }
}
