package LLD.DesignPattern.CreationalDesignPattern.PrototypePattern.TraditionalWay;

public class PlayerFactory {

    public static final String DEFAULT_NAME = "John Doe";
    public static final int DEFAULT_HEALTH = 100;
    public static final int DEFAULT_MAX_HP = 100;
    public static final int DEFAULT_STRENGTH = 0;

    public static Player createCharacterWithName(String name){
        return new Player(name,DEFAULT_HEALTH,DEFAULT_MAX_HP,DEFAULT_STRENGTH);
    }

    public static Player createCharacterWithHealth(int hp){
        return new Player(DEFAULT_NAME,hp,DEFAULT_MAX_HP,DEFAULT_STRENGTH);
    }

    public static Player createCharacterWithStrength(int strength){
        return new Player(DEFAULT_NAME,strength,DEFAULT_MAX_HP,DEFAULT_STRENGTH);
    }

    public static Player createCharacterWithMaxHp(int maxHp){
        return new Player(DEFAULT_NAME,DEFAULT_HEALTH,maxHp,DEFAULT_STRENGTH);
    }

}
