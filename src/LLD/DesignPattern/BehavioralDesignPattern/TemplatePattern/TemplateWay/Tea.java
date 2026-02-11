package LLD.DesignPattern.BehavioralDesignPattern.TemplatePattern.TemplateWay;


public class Tea extends Beverage {
    @Override
    protected void mix() {
        System.out.println("Adding Lemon and Sugar");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping Tea Bag");
    }
}
