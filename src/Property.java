public class Property extends Space {

    private String name;
    private int price;
    private int rent;
    private Player ownedBy;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int i) {
        price = i;
    }

    public int getPrice() {
        return price;
    }

    public void setRent(int i) {
        rent = i;
    }

    public int getRent() {
        return rent;
    }

    public void setOwnedBy(Player p) {
        ownedBy = p;
    }

    public Player getOwnedBy() {
        return ownedBy;
    }
}
