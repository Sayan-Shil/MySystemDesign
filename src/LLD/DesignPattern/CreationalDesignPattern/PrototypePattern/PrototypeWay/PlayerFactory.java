package LLD.DesignPattern.CreationalDesignPattern.PrototypePattern.PrototypeWay;

public class PlayerFactory {
    public static final String DEFAULT_NAME = "John Doe";
    public static final int DEFAULT_HEALTH = 100;
    public static final int DEFAULT_MAX_HP = 100;
    public static final int DEFAULT_STRENGTH = 0;
    public Player defaultPlayer;

    public PlayerFactory(){
        defaultPlayer = new Player(DEFAULT_NAME,DEFAULT_HEALTH,DEFAULT_MAX_HP,DEFAULT_STRENGTH);
    }

    public Player createCharacterWithName(String name){
        Player player = defaultPlayer.clone();
        player.setName(name);
        return player;
    }
    public Player createCharacterWithHealth(int hp){
        Player player = defaultPlayer.clone();
        player.setHp(hp);
        return player;
    }

    public Player  createCharacterWitMaxHealth(int maxHp){
        Player player = defaultPlayer.clone();
        player.setMaxHp(maxHp);
        return player;
    }

    public Player createCharacterWithStrength(int strength){
        Player player = defaultPlayer.clone();
        player.setStrength(strength);
        return player;
    }

}
