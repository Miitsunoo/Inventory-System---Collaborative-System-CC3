public class Inventory {
    private String name;

    public Inventory(String name){
        this.name = name;
    }

    public void storeItem(Item item) {
        this.item = item;
    }

    public String InventoryID() {
        return "This is the inventory.";
    }

    
}