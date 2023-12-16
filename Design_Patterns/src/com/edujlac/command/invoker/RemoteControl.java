package com.edujlac.command.invoker;

import com.edujlac.command.commands.Command;
import com.edujlac.command.commands.NoCommand;

public class RemoteControl {

    private final Command[] onCommand;
    private final Command[] offCommand;
    private Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }

        undoCommand = new NoCommand();
    }

    public RemoteControl setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;

        return this;
    }

    public void onButtonPushed(int slot){
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonPushed(int slot) {
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
        System.out.println("[undo] " + undoCommand.getClass().getName());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommand.length; i++) {
            builder.append("[slot ").append(i).append("] ")
                    .append(onCommand[i].getClass().getName()).append("\t")
                    .append(offCommand[i].getClass().getName()).append("\n");
        }
        return builder.toString();
    }
}
