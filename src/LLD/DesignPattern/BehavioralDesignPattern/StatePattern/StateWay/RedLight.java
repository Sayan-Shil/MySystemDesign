package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.StateWay;

public class RedLight implements TrafficLightState {
    @Override
    public void next(TrafficContext trafficContext) {
        System.out.println("Light changes to Red to Green, Cars Go !");
        trafficContext.setState(new GreenLight());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
