package LLD.DesignPattern.BehavioralDesignPattern.TemplatePattern.TemplateWay;

public class Coffee extends Beverage  {
    @Override
    protected void mix() {
        System.out.println("Adding Sugar And Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing Coffee");
    }
}
