package LLD.DesignPrinciple.SOLID.S.SingleResponsiblePrinciple.BadCode;

public class Bakery {
    public void bakeCake() {
        System.out.println("Baking Cake");
    }
    public void manageInventory() {
        System.out.println("Manage Inventory");
    }
    public void supplyOrder() {
        System.out.println("Supply Order");
    }
    public void cleanBakery() {
        System.out.println("Clean Bakery");
    }

    static void main() {
        Bakery bakery = new Bakery();
        bakery.bakeCake();
        bakery.manageInventory();
        bakery.supplyOrder();
        bakery.cleanBakery();
    }
}
