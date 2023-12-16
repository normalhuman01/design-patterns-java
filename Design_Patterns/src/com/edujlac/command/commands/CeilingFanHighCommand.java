package com.edujlac.command.commands;

import com.edujlac.command.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command{

    private final CeilingFan ceilingFan;
    private CeilingFan.Status prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH: ceilingFan.high();       break;
            case MEDIUM: ceilingFan.medium();   break;
            case LOW: ceilingFan.low();         break;
            case OFF: ceilingFan.off();         break;
        }
    }
}
