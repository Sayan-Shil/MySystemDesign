package LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Command;


import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Machine.Fan;

public class FanStartCommand implements Command {
    private Fan fan;

    public FanStartCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
