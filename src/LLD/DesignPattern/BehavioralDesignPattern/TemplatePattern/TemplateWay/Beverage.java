package LLD.DesignPattern.BehavioralDesignPattern.TemplatePattern.TemplateWay;

public abstract class Beverage {

    private boolean isPrepared = false;

    public boolean isPrepared() {
        return isPrepared;
    }

    public final void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        mix();
        isPrepared = true;
    }

    // Things that can be changed
    protected abstract void mix();
    protected abstract void brew();

    // Mandatory
    public void boilWater() {
        System.out.println("Boiling Water");
    }
    private void pourInCup() {
        System.out.println("Pouring In Cup");
    }

}
