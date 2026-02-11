package LLD.DesignPattern.BehavioralDesignPattern.CommandPattern.Traditional;

public class RemoteControl {
    void pressButton(String machine, int action){
        switch(machine.toLowerCase()){
            case "light" :
                Light light = new Light();
                if(action == 0) {
                    light.turnOff();
                } else {
                    light.turnOn();
                }
                break;

            case "fan" :
                Fan fan = new Fan();
                if(action == 0) fan.turnOff();
                else fan.turnOn();
                break;
            default:
                System.out.println("Invalid action");
        }
    }
}
