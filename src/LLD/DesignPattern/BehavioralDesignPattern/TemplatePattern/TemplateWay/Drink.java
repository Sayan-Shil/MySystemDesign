package LLD.DesignPattern.BehavioralDesignPattern.TemplatePattern.TemplateWay;

public class Drink {
    static void main() {
        Beverage beverage = new Coffee();
        beverage.prepareBeverage();
        beverage = new Tea();
        beverage.prepareBeverage();
    }
}
