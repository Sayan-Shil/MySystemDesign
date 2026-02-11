package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.StateWay;

import LLD.DesignPattern.BehavioralDesignPattern.StatePattern.TraditionalWay.TrafficLight;

public class TrafficContext {
    TrafficLightState state;

    public TrafficContext(){
        this.state = new RedLight();
    }

    public void setState(TrafficLightState lightState) {
        this.state = lightState;
    }

    public void getColor(){
        System.out.println(state.getColor());
    }

    public void nextColor(){
        state.next(this);
    }
}
