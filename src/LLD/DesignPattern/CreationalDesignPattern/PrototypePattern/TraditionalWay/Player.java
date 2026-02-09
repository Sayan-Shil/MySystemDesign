package LLD.DesignPattern.CreationalDesignPattern.PrototypePattern.TraditionalWay;

public class Player {

    private String name;
    private int hp;
    private int maxHp;
    private int strength;
    public Player(String name, int hp, int maxHp, int strength) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.strength = strength;
    }


//    // Prototype cloning method
//    @Override
//    public Player clone() {
//        try {
//            return (Player) super.clone();   // shallow copy
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException("Cloning failed", e);
//        }
//    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", strength=" + strength +
                '}';
    }
}
