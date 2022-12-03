package command.command.impl;

import command.command.Command;
import command.receiver.Light;

public class LightOnCommand implements Command {
    private Light light; // 리시버 객체

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
