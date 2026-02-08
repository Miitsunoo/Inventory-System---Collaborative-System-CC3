public class Item {
    private String itemname;

    public Item(String itemname){ /* constructor */
        this.itemname = itemname;
    }

    public String identityOfItem(){
        return itemname;
    }
}