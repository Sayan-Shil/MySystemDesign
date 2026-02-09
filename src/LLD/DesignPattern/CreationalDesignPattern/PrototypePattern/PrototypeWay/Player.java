package LLD.DesignPattern.CreationalDesignPattern.PrototypePattern.PrototypeWay;

public class Player implements Cloneable {

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

    public static PlayerFactory getPlayer(){
        return new PlayerFactory();
    }

    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public Player clone() {
        try {
            return (Player) super.clone();   // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }


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
