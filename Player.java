public class Player {
    private String username;
    private Inventory inventory;

    public Player(String username) { 
        this.username = username;
        this.inventory = new Inventory(3);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String identity() {
        return "I am the Player class. I represent the player in the game.";
    }
}
