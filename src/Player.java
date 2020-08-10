import java.lang.reflect.Field;
import java.util.ArrayList;

public class Player {
    private String name;
    private GameManager.Colors color;
    private ArrayList<Property> ownedProperties;
    private int coins;
    private PlayerType type;

    public Player(String name, String color, int coins, PlayerType type) {
        this.name = name;
        this.color = GameManager.Colors.valueOf(color);
        this.coins = coins;
        this.type = type;
        ownedProperties = new ArrayList<>();
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setColor(String s) {
        color = GameManager.Colors.valueOf(s);
    }

    public GameManager.Colors getColor() {
        return color;
    }

    public ArrayList<Property> getOwnedProperties() {
        return ownedProperties;
    }

    public void setOwnedProperties(ArrayList<Property> a) {
        ownedProperties = a;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int i) {
        coins = i;
    }

    public PlayerType getType() {
        return type;
    }

    enum PlayerType {
        CPU,
        USER
    }

    public void printStats() throws IllegalAccessException {
        for (Field f: Player.class.getDeclaredFields()) {
            System.out.println(f.getName() + " - " + f.get(this));
        }
    }
}
