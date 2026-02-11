package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.StateWay;

public interface TrafficLightState {
    void next(TrafficContext trafficContext);
    String getColor();
}
