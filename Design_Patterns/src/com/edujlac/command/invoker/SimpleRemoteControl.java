package com.edujlac.command.invoker;

import com.edujlac.command.commands.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl setCommand(Command command) {
        slot = command;
        return this;
    }

    public void buttonWasPressed() {
        try {
            slot.execute();
        } catch (NullPointerException exception) {
            System.out.println("No command was entered.");
        }

    }
}
