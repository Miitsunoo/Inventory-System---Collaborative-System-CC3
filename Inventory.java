public class Inventory {
    private Item item;
    private String name;

    public Inventory(String name) {
        this.name = name;
    }

    public void storeItem(Item item) {
        this.item = item;
    }

    public String identityOfInventory() {
        return name + " it contains: " + item.identityOfItem();
    }
}