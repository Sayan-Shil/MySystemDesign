package LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.Traditional;

public class Client {
    static void main() {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.pressButton("fan",1);
    }
}
