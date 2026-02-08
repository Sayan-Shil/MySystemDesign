package LLD.DesignPrinciple.SOLID.S.SingleResponsiblePrinciple.GoodCode;

public class Bakery {
    static void main() {
        Baker baker = new Baker();
        BakeryCleaner bakeryCleaner = new BakeryCleaner();
        InventoryManager inventoryManager = new InventoryManager();
        OrderSupplier orderSupplier = new OrderSupplier();

        baker.bakeCake();
        bakeryCleaner.cleanBakery();
        orderSupplier.supplyOrder();
        inventoryManager.manageInventory();
    }
}
