package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.TraditionalWay;

public class Main {
    static void main() {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
    }
}
