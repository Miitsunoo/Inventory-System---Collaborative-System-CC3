public class Player {
    private String username;
    private Inventory inventory;

    public Player(String username) { 
        this.username = username;
        this.inventory = new Inventory ("THIS IS THE PLAYER INVENTORY.");
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String identity() {
        return "I am the Player class. I represent the player in the game!!.";
    }
}
