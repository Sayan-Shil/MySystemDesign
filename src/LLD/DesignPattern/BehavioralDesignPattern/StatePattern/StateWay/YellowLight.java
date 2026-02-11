package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.StateWay;

public class YellowLight implements TrafficLightState{
    @Override
    public void next(TrafficContext trafficContext) {
        System.out.println("Light changes to Yellow to Red, Cars Stop !");
        trafficContext.setState(new RedLight());
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
