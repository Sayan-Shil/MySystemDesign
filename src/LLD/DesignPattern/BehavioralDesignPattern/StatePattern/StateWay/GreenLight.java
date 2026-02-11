package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.StateWay;

public class GreenLight implements TrafficLightState{
    @Override
    public void next(TrafficContext trafficContext) {
        System.out.println("Light changes to Green to Yello, Cars Slow Down !");
        trafficContext.setState(new YellowLight());
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
