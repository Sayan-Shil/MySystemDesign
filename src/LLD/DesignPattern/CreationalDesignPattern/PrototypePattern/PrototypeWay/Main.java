package LLD.DesignPattern.CreationalDesignPattern.PrototypePattern.PrototypeWay;


public class Main {
    static void main() {
        Player player001 = Player.getPlayer().createCharacterWithName("Sayan");
        Player player002 = Player.getPlayer().createCharacterWithName("Sayan");
        System.out.println(player001);
        System.out.println(player002);
    }
}
