package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private final List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand cmd) {
        commands.add(cmd);
    }

    @Override
    public void execute(Job2dDriver d) {
        for (DriverCommand command : commands) {
            command.execute(d);
        }
    }
}