package LLD.DesignPrinciple.SOLID.D.DependencyInversion.GoodCode;

public class Juicer {
    Fruit fruit;
    public Juicer(Fruit fruit) {
        this.fruit = fruit;
    }
    public void makeJuice() {
        System.out.println(fruit.extract());
    }

    static void main() {
        Fruit fruit = new Apple();
        Juicer juicer = new Juicer(fruit);
        juicer.makeJuice();
        juicer.fruit = new Mango();
        juicer.makeJuice();
    }
}
