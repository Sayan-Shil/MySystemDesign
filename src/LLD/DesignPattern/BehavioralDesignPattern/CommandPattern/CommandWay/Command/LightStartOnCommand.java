package LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Command;

import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Machine.Light;

public class LightStartOnCommand implements Command {
    private Light light;
    public LightStartOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
