package LLD.DesignPattern.BehavioralDesignPattern.TemplatePattern.TraditionalWay;

public class Tea {
    private boolean isPrepared= false;
    public boolean isPrepared(){
        return isPrepared;
    }
    public void prepare(){
        boilWater();
        steepTeaBag();
        pourInCup();
       addLemonAndSugar();
        isPrepared= true;
    }

    private void addLemonAndSugar() {
        System.out.println("Adding Lemon and Sugar");
    }

    private void steepTeaBag() {
        System.out.println("Steep Tea Bag");
    }


    private void pourInCup() {
        System.out.println("Pouring In Cup");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }
}
