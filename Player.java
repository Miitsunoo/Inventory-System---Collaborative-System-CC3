public class Player {
    private String username;
    private Inventory inventory;

    public Player(String username) { 
        this.username = username;
        this.inventory = new Inventory("This is the player's Inventory,");
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String identityOfPlayer() {
        return "This is Player class. The player's name is: " + username;
    }
}
