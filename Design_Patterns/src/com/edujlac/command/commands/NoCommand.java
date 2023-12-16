package com.edujlac.command.commands;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No action.");
    }

    @Override
    public void undo() {

    }
}
