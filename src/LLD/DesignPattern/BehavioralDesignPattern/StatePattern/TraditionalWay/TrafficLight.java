package LLD.DesignPattern.BehavioralDesignPattern.StatePattern.TraditionalWay;

public class TrafficLight {
    private String color;
    TrafficLight(){
        this.color = "red";
    }
    public String getColor() {
        return color;
    }
    public void next(){
        switch (color) {
            case "red":
                color = "green";
                System.out.println("Light changes to Red to Green, Cars Go !");
                break;
            case "green":
                    color = "yellow";
                    System.out.println("Light changes to Green to Yellow, Cars Be cautious !");
                    break;


            case "yellow":
                        color = "red";
                        System.out.println("Light changes to Yellow to Red, Cars Stop !");
                        break;
        }

    }
}
