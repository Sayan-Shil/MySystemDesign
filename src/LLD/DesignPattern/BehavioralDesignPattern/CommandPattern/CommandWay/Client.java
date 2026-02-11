package LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay;

import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Command.Command;
import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Command.FanStartCommand;
import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Command.LightStartOnCommand;
import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Machine.Fan;
import LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.CommandWay.Machine.Light;

public class Client {
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Command lightOn = new LightStartOnCommand(livingRoomLight);
        Command fanStart = new FanStartCommand(ceilingFan);

        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        remote.setCommand(fanStart);
        remote.pressButton();

    }
}
