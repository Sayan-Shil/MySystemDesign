package LLD.DesignPattern.CreationalDesignPattern.PrototypePattern.TraditionalWay;

public class Main {
    static void main() {
        Player player001 = PlayerFactory.createCharacterWithName("Sayan");
        Player player002 = PlayerFactory.createCharacterWithName("Shil");
        System.out.println(player001);
        System.out.println(player002);
    }
}
