package LLD.DesignPattern.BehavioralDesignPattern.TemplatePattern.TraditionalWay;

public class Coffee {
    private boolean isPrepared= false;
    public boolean isPrepared(){
        return isPrepared;
    }
    public void prepare(){
        boilWater();
        brewCoffee();
        pourInCup();
        addMilkAndSugar();
        isPrepared= true;
    }

    private void addMilkAndSugar() {
        System.out.println("Adding Milk and Sugar");
    }

    private void pourInCup() {
        System.out.println("Pouring In Cup");
    }

    private void brewCoffee() {
        System.out.println("Brewing Coffee");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }
}
