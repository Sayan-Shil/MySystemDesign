package LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay;

import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Command.Command;

public class RemoteController {
    private Command command;
    private boolean mode= false;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
